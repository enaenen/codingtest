package space.baekjoon.codeplus.stack;

import java.io.*;
import java.util.Stack;

public class BJ17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNumbers = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] nums = input.split(" ");
        Stack<Integer> stack = new Stack<Integer>();
        for (String num : nums) {
            stack.add(Integer.parseInt(num));
        }
        while(!stack.empty()) {
            int target = stack.pop();

        }
    }
}
