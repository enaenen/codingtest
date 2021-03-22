package jooeun.LeetCode;

import java.text.NumberFormat;

public class PalindromeNumber {

    static public void main(String[] args){

        int x = 121;

        boolean answer = solution(x);
        System.out.println(x + "is Palindrome " + answer);
    }

    static public boolean solution(int x) {

        if(x < 0){
            return false;
        }else{
            StringBuilder sb = new StringBuilder(x + "");

            try {
                if (x == Integer.parseInt(sb.reverse() + ""))
                    return true;
                else
                    return false;
            }catch (NumberFormatException e){
                return false;
            }
        }
    }

}
