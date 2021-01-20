package space.baekjoon.codeplus.stack;

import java.io.*;
import java.util.Stack;

public class BJ17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String inputString = br.readLine();
        Stack<Character> reverseStack = new Stack<Character>();
        boolean isInnerTag = false;
        char[] charArray = inputString.toCharArray();
        for (char ch : charArray) {
            if (ch == '<') {
                isInnerTag = true;
                while (!reverseStack.empty()) {
                    bw.write(reverseStack.pop());
                }
                bw.write(ch);
            } else if (ch == '>') {
                isInnerTag = false;
                bw.write(ch);
            } else if (isInnerTag) {
                bw.write(ch);
            } else {
                if (ch == ' ') {
                    while (!reverseStack.empty()) {
                        bw.write(reverseStack.pop());
                    }
                    bw.write(ch);
                } else {
                    reverseStack.push(ch);
                }
            }
        }
        while (!reverseStack.empty()) {
            bw.write(reverseStack.pop());
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
