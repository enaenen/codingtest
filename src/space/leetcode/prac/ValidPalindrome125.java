package space.leetcode.prac;



public class ValidPalindrome125 {
    public static boolean solution(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder sb = new StringBuilder(s).reverse();
        return s.equals(sb.toString());
    }

    public static void main(String[] args) {
        String a = "A man, a plan, a canal: Panama";
        String b = "race a car";
        String c = " ";
        System.out.println("1. TRUE == " + solution(a));
        System.out.println("2. FALSE == " + solution(b));
        System.out.println("3. TRUE == " + solution(c));
    }
}
