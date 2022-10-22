import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numOfFlowersArr = br.readLine().split("\\s+");
        String text;
        Map<String, String> flowermap = new HashMap<String, String>();
        for(int i = 0; i < 3; i++) {
            text = br.readLine();
            if(!text.isEmpty()) {
                String[] flowers = text.split(" ");
                for(String ele : flowers) {
                    if(!flowermap.getOrDefault(ele, "").contains(""+i))
                        flowermap.put(ele, flowermap.getOrDefault(ele, "")+ i);
                }
            }
        }
        // for(Map.Entry<String, String> entry : flowermap.entrySet()) {
        //     System.out.println("Key=" + entry.getKey() + " Value=" + entry.getValue());
        // }

        int[] first = new int[3];
        int[] second = new int[3];
        String persons;
        for(Map.Entry<String, String> entry : flowermap.entrySet()) {
            persons = entry.getValue();
            if(persons.length() == 1) {
                first[Integer.parseInt(entry.getValue())] += 1;
            } else {
                if(persons.length() == 2) {
                    if(!persons.contains("0"))
                        second[0] += 1;
                    if(!persons.contains("1"))
                        second[1] += 1;
                    if(!persons.contains("2"))
                        second[2] += 1;
                }
            }
        }
        System.out.println(first[0] + " " + second[0]);
        System.out.println(first[1] + " " + second[1]);
        System.out.print(first[2] + " " + second[2]);
    }
}
