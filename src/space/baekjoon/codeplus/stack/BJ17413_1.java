package space.baekjoon.codeplus.stack;

import java.io.*;
import java.util.Stack;

public class BJ17413_1 {
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
                print(reverseStack);
                bw.write(ch);
            } else if (ch == '>') {
                isInnerTag = false;
                bw.write(ch);
            } else if (isInnerTag) {
                bw.write(ch);
            } else {
                if (ch == ' ') {
                    print(reverseStack);
                } else {
                    reverseStack.push(ch);
                }
            }
        }
        print(reverseStack);
    }

    public static void print(Stack<Character> stack) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (!stack.empty()) {
            bw.write(stack.pop());
            bw.flush();
        }
        bw.close();
    }
}
