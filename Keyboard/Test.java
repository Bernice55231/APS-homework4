import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        String output = "";
        for(int i = 0; i < text.length()-1; i++) {
            if(text.charAt(i+1) != '<')
                output += text.charAt(i);
            
            if(text.charAt(i) == '<')
                continue;
        }
        
        System.out.print(output);
    }
}
