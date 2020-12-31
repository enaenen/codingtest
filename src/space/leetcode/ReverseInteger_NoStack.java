package space.leetcode;

import java.util.Stack;

public class ReverseInteger_NoStack {
    public static void main(String[] args) {
//        System.out.println(reverse(123));
        System.out.println(reverse(-321));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
    }
    public static int reverse(int x) {
        String s = Integer.toString(x);
        boolean minus=false;
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if(c=='-'){
                minus=true;
            }
            else {
                sb.append(c);
            }
        }
        sb.reverse();
        if(minus) sb.insert(0,"-");
        if(sb.length()>=10){
            long bigInput = Long.parseLong(sb.toString());
            if(bigInput>=(Integer.MAX_VALUE)-1 || bigInput<=Integer.MIN_VALUE)
            return 0;
        }
        return Integer.parseInt(sb.toString());
    }
}
