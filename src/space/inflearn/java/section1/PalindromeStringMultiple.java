package space.inflearn.java.section1;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeStringMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine().toUpperCase().replaceAll("[^A-Z]","");
        String reversed = new StringBuilder(words).reverse().toString();
        if (words.equals(reversed))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
