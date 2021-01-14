package space.baekjoon.codeplus.math.gcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ17087Re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int start = Integer.parseInt(s[1]);
        int[] answer = new int[n];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < inputs.length; i++) {
            answer[i] = Math.abs(Integer.parseInt(inputs[i]) - start);
        }
        start=answer[0];
        for(int i=1;i<answer.length;i++){
         start=gcd(start,answer[i]);
        }
        System.out.println(start);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
