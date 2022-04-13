package space.inflearn.java.section1;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next().toLowerCase();
        StringBuilder reversed = new StringBuilder(word).reverse();
        if (word.equals(reversed.toString()))
            System.out.println("YES");
        else
            System.out.println("NO");

        solution(word);
    }

    public static void solution(String word){
        String answer = "YES";
        int len = word.length();
        for (int i = 0; i < len/2 ; i++){
            if (word.charAt(i) != word.charAt(len - i - 1)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
