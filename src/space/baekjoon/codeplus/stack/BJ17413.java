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
        for (char c : charArray) {
            if (!isInnerTag && c == ' ') {
                while (!reverseStack.empty()) {
                    sb.append(reverseStack.pop());
                }
                sb.append(c);
                continue;
            }

            if (isInnerTag) {//태그안에있을경우 그대로 출력
                if (c == '>') isInnerTag = false;
                sb.append(c);
            } else {//태그안이 아닐경우
                if (c == '<') {//태그가 시작될경우
                    isInnerTag = true;
                    while (!reverseStack.empty()) {
                        sb.append(reverseStack.pop());
                    }
                    sb.append(c);
                } else {
                    reverseStack.push(c);
                    if (c == charArray[charArray.length - 1]) {
                        while (!reverseStack.empty()) {
                            sb.append(reverseStack.pop());
                        }
                    }
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
