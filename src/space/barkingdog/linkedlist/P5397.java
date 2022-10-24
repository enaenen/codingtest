package space.barkingdog.linkedlist;

import java.io.*;
import java.util.Stack;

public class P5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Character> left = new Stack<Character>();
            Stack<Character> right = new Stack<Character>();
            char[] input = br.readLine().toCharArray();
            for (char c : input) {
                if (c == '<') {
                    if (!left.empty()) {
                        right.push(left.pop());
                    }
                } else if (c == '>') {
                    if (!right.empty())
                        left.push(right.pop());
                } else if (c == '-') {
                    if (!left.empty())
                        left.pop();
                } else {
                    left.push(c);
                }
            }
            while (!left.isEmpty())
                right.push(left.pop());
            while (!right.isEmpty())
                bw.write(right.pop());
            bw.write('\n');
            bw.flush();
        }
    }
}
