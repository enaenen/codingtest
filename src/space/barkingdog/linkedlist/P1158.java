package space.barkingdog.linkedlist;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class P1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 1; i < n + 1; i++)
            queue.add(i);
        int index = 1;
        bw.write("<");
        while (!queue.isEmpty()) {
            if (index == k) {
                index = 1;
                bw.write(queue.poll().toString());
                if (queue.isEmpty())
                    break;
                bw.write(", ");
            }
            else {
                index++;
                queue.offer(queue.poll());
            }
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}
