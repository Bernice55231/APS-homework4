import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        String[] line;
        int total = 0;
        for(int i = 0; i < n; i++) {
            line = br.readLine().split("\\s+");
            int len = Integer.parseInt(line[0]);
            for(int j = 0; j < len; j++) {
                int ele = Integer.parseInt(line[j+1]);
                maxheap.add(ele);
                minheap.add(ele);
            }
            maxheap.remove(minheap.peek());
            minheap.remove(maxheap.peek());
            total += maxheap.poll() - minheap.poll();
        }
        System.out.println(total);



    }
}
