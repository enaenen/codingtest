package space.leetcode.prac;

public class ReverseString344 {
    public static void reverseString(char[] s){
        int start = 0;
        int end = s.length -1;
        while (start < end && start != end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        reverseString(arr);
        for (char c : arr) {
            System.out.printf(""+c);
        }
    }
}
