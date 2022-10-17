package space.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int check[] = new int[26];

        for (char c : a.toCharArray())
            check[c - 'a']++;
        for (char c : b.toCharArray())
            check[c - 'a']--;

        int cnt = 0;
        for (int i : check)
            if (i != 0)
                cnt += Math.abs(i);
        System.out.println(cnt);
    }
}
