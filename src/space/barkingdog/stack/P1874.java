package space.barkingdog.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 1; i < n + 1; i++) {
            arr[i - 1] = n;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int counter = 0;
        while (0 < n--) {
            int input = Integer.parseInt(br.readLine());
            if (counter < input) {
                while (counter < input) {
                    stack.add(++counter);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                if (input < stack.peek()) {
                    while (stack.pop() == input)
                        sb.append("-\n");
                } else if (stack.peek() == input) {
                    stack.pop();
                    sb.append("-\n");
                } else {
                    sb = new StringBuilder();
                    sb.append("NO");
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }
}


