package space.barkingdog.deque;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class P10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push_front")) {
                deq.addFirst(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("push_back")) {
                deq.addLast(Integer.parseInt(cmd[1]));
            } else if (!deq.isEmpty() && cmd[0].equals("pop_front")) {
                bw.write(deq.removeFirst() + "\n");
            } else if (!deq.isEmpty() && cmd[0].equals("pop_back")) {
                bw.write(deq.removeLast() + "\n");
            } else if (cmd[0].equals("size")) {
                bw.write(deq.size() + "\n");
            } else if (cmd[0].equals("empty")) {
                if (deq.isEmpty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            } else if (!deq.isEmpty() && cmd[0].equals("front")) {
                bw.write(deq.peekFirst() + "\n");
            } else if (!deq.isEmpty() && cmd[0].equals("back")) {
                bw.write(deq.peekLast() + "\n");
            } else {
                bw.write(-1 + "\n");
            }
        }
        bw.flush();
    }
}
