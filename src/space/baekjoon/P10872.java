package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class P10872 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(recursive(num));
    }
    public static int recursive(int n){
        if(n==1) return 1;

        return n * recursive(n-1);
    }
}
