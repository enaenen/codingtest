package space.barkingdog.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class P10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<Integer>();
        //Queue 맨 뒤에것을 push 할때마다 저장
        int back = -1;
        for (int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("push")) {
                queue.add(Integer.parseInt(cmd[1]));
                back = Integer.parseInt(cmd[1]);
            } else if (!queue.isEmpty() && cmd[0].equals("pop")) {
                bw.write(queue.remove() + "\n");
            } else if (cmd[0].equals("size")) {
                bw.write(queue.size() + "\n");
            } else if (cmd[0].equals("empty")) {
                if (queue.isEmpty())
                    bw.write(1 + "\n");
                else
                    bw.write((0 + "\n"));
            } else if (!queue.isEmpty() && cmd[0].equals("front")) {
                bw.write(queue.peek() + "\n");
            } else if (!queue.isEmpty() && cmd[0].equals("back")) {
                bw.write(back + "\n");
            } else {
                bw.write("-1\n");
            }
        }
        bw.flush();
    }
}
