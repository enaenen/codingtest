package space.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);
        long min = Long.min(a, b);
        long max = Long.max(a, b);

        long diff = Math.abs(max - min);
        if (diff == 0)
            System.out.println(0);
        else
            System.out.println(diff - 1);
        for (long i = 1; i < diff; ++i)
            System.out.print(i + min + " ");
    }
}
