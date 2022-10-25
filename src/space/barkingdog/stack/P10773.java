package space.barkingdog.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0)
                stack.pop();
            else
                stack.add(input);
        }
        long total = stack.stream().mapToLong(i -> i).sum();
        System.out.println(total);
    }
}
