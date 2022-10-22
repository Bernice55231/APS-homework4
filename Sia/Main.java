import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] text;
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        boolean sflag = true;
        boolean qflag = true;
        boolean pqflag = true;

        for(int i = 0; i < n; i++) {
            text = br.readLine().split("\\s+");
            int op = Integer.parseInt(text[0]);
            int num = Integer.parseInt(text[1]);
            if(op == 1) {
                if(sflag)
                    s.push(num);
                if(qflag)
                    q.add(num);
                if(pqflag)
                    pq.add(num);
            } else {
                if(!sflag && !qflag && !pqflag)
                    break;
                if(sflag) {
                    if(s.isEmpty() || (num != s.peek()))
                        sflag = false;
                    else
                        s.pop();
                }
                if(qflag) {
                    if(q.isEmpty() || (num != q.peek()))
                        qflag = false;
                    else 
                        q.remove();
                }
                if(pqflag) {
                    if(pq.isEmpty() || (num != pq.peek()))
                        pqflag = false;
                    else 
                        pq.remove();
                }
            }
            
        }
        if(sflag) {
            if(!qflag && !pqflag)
                System.out.println("stack");
            else
                System.out.println("not sure");
        } else {
            if(qflag && pqflag) 
                System.out.println("not sure");
            else if(!qflag && !pqflag) {
                System.out.println("impossible");
            } else {
                if(qflag)
                    System.out.println("queue");
                else
                    System.out.println("priority queue");
            }
        }
    }
}
