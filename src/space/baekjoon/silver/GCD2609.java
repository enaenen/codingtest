package space.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int lcm = a*b;
        while (b!=0){
            int gcd=a%b;
            a=b;
            b=gcd;
        }
        System.out.println(a);
        System.out.println(lcm/a);
    }
}
