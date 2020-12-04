package space.leetcode;

import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-321));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
    }
    public static int reverse(int x) {
        String s = Integer.toString(x);
        char icon='\0';
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (char c : charArray) {
            if(c=='-'){
                icon=c;
            }else {
                stack.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        if(icon!='\0') sb.append(icon);
        while(!stack.empty()) {
            sb.append(stack.pop());
        }
        if(sb.length()>=10){
            long bigInput = Long.parseLong(sb.toString());
            if(bigInput>=(Integer.MAX_VALUE)-1 || bigInput<=Integer.MIN_VALUE)
            return 0;
        }
        return Integer.parseInt(sb.toString());
    }
}
