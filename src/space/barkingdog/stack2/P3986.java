package space.barkingdog.stack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        while (0 < n--){
            String input = br.readLine();
            if (input.length() % 2 != 0)
                continue;
            Stack<Character> stack = new Stack<Character>();

            for (char c : input.toCharArray()) {
                if(stack.isEmpty())
                    stack.push(c);
                else {
                    //ABBA
                    if (c == (char)stack.peek()){
                        stack.pop();
                    }
                    else {
                        stack.push(c);
                    }
                }
            }
            if (stack.isEmpty())
                answer++;
        }
        System.out.println(answer);
    }
}
