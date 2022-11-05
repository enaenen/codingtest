package space.barkingdog.stack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<Character>();
        String input = br.readLine();

        int cnt = 0;
        char previous = 0;
        for (char c : input.toCharArray()) {
            if (c == '(') {
                cnt++;
                stack.push(c);
            }
            if (c == ')') {
                stack.pop();
                if (previous == '(') {
                    cnt--;
                    cnt += stack.size();
                }
            }
            previous = c;
        }
        System.out.println(cnt);
    }
}
