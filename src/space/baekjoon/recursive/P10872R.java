package space.baekjoon.recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10872R {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 1;
        if (n == 0) System.out.println(n);
        else {
            while (n-- > 1) {
                result *= n;
            }
            System.out.println(result);
        }
    }
}
