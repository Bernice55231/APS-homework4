import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // io
        int n = Integer.parseInt(br.readLine());
        String[] text = br.readLine().split(" ");
        PriorityQueue<Long> numpq = new PriorityQueue<>();
        for(int i = 0; i < n; i++) {
            numpq.add(Long.parseLong(text[i]));
        }
        long tmp = 0;
        long res = 0;
        while(numpq.size() > 1) {
            tmp = numpq.poll() + numpq.poll();
            res += tmp;
            numpq.add(tmp);
        }
        System.out.println(res);
    }
}
