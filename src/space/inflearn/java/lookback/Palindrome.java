package space.inflearn.java.lookback;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toLowerCase().replaceAll("[^A-Za-z]","");
        StringBuilder sb = new StringBuilder(input);
        if (input.equals(sb.reverse().toString()))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
