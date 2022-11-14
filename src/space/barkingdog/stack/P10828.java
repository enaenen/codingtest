package space.barkingdog.stack;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class P10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n ; i++){
            String[] cmd = br.readLine().split(" ");
            if(cmd[0].equals("push")){
                stack.push(Integer.parseInt(cmd[1]));
                continue;
            }else if (cmd[0].equals("pop")){
                if (stack.empty())
                    sb.append(-1);
                else
                    sb.append(stack.pop());
            }else if (cmd[0].equals("size")){
                sb.append(stack.size());
            }else if (cmd[0].equals("empty")){
                sb.append(stack.empty() ? 1 : 0);
            }else if (cmd[0].equals("top")){
                if (stack.empty())
                    sb.append(-1);
                else
                    sb.append(stack.peek());
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
