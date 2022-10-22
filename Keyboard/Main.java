import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine(); // also can be modified into StringBuilder

        Stack<Character> s = new Stack<>();
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '<') {
                if(!s.isEmpty())
                    s.pop();
            } else {
                s.push(text.charAt(i));
            }
        }
        StringBuilder output = new StringBuilder();
        for(Character c : s) {
            output.append(c);
        }
        System.out.print(output.toString());
    }
}
