package space.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String numberString = Integer.toString(x);
        return Integer.toString(x).equals(new StringBuilder(numberString).reverse().toString());
    }
    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(121));
    }
}
