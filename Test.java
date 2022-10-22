import java.util.*;

import java.io.*;

public class Test{
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readStr = br.readLine();
        System.out.println(readStr.isEmpty());

        String[] text = br.readLine().split(" ");
        System.out.println(text[0].indexOf("\n\r"));

        for(String ele : text) {
            System.out.print("enter here: " + ele);
        }
        PriorityQueue<Integer> intpq = new PriorityQueue<>((a,b) -> b - a);
        // intpq.add(5);
        // intpq.add(13);
        // intpq.add(43);
        // intpq.add(52);
        // intpq.add(17);
        // intpq.add(9);
        // intpq.add(23);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 3);
        map.put(2, 5);
        map.put(3, 9);
        map.put(1, 3);
        // for (Map.Entry<Integer, Integer> set : map.entrySet()) {
 
        //     // Printing all elements of a Map
        //     System.out.println(set.getKey() + " = "
        //                        + set.getValue());
        // }

        // while (!intpq.isEmpty()) {
        //     System.out.println(intpq.poll());
        // }
        // System.out.println(intpq.peek());

    }
}