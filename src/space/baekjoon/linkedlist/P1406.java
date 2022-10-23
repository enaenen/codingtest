package space.baekjoon.linkedlist;

import java.io.*;
import java.util.Stack;

public class P1406 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> left = new Stack<Character>();
        Stack<Character> right = new Stack<Character>();

        String inputStr = br.readLine();
        for (char c : inputStr.toCharArray()) {
            left.add(c);
        }


        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("P")) {
                left.add(cmd[1].charAt(0));
            } else if (cmd[0].equals("B") && !left.empty()) {
                left.pop();
            } else if (cmd[0].equals("L") && !left.empty()) {
                right.add((left.pop()));
            } else if (cmd[0].equals("D") && !right.empty()) {
                left.add(right.pop());
            }
        }
        for (Character c : left) {
            bw.write(c);
        }
        while (!right.empty())
            bw.write(right.pop());
        bw.flush();
        bw.close();
    }
}
//yx
