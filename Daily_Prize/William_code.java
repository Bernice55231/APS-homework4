import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    private static class Element {
        int val;
        boolean valid;

        public Element(int val) {
            this.val = val;
            this.valid = true;
        }
    }

    private static final PriorityQueue<Element> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
    private static final PriorityQueue<Element> maxHeap = new PriorityQueue<>((a, b) -> b.val - a.val);
    private static long result = 0;

    private static void sumPrize(int[] orders) {
        if (orders != null) {
            for (int ii : orders) {
                Element current = new Element(ii);
                minHeap.add(current);
                maxHeap.add(current);
            }
        }

        Element max;
        while (true) {
            Element currMax = maxHeap.poll();
            if (currMax.valid) {
                currMax.valid = false;
                max = currMax;
                break;
            }
        }

        Element min;
        while (true) {
            Element currMin = minHeap.poll();
            if (currMin.valid) {
                currMin.valid = false;
                min = currMin;
                break;
            }
        }

        result += max.val - min.val;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        for (int ii = 0; ii < days; ii++) {
            int n = sc.nextInt();
            int[] orders = new int[n];
            for (int jj = 0; jj < n; jj++) {
                orders[jj] = sc.nextInt();
            }

            sumPrize(orders);
        }

        System.out.println(result);
    }
}