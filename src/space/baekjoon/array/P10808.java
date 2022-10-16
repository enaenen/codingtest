package space.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10808 {
    public static void main(String[] args) throws IOException {
        int[] alphabet = new int[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++)
            alphabet[input.charAt(i) - 'a']++;
        for (int i : alphabet)
            System.out.print(i + " ");
    }
}
