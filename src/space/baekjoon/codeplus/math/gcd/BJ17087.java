package space.baekjoon.codeplus.math.gcd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 거리에대한 최대값
 *
 */
public class BJ17087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int start = Integer.parseInt(input[1]);
        int[] answer = new int[n];
        String[] nLocationInputs = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            int nLocation = Integer.parseInt(nLocationInputs[i]);
            int distance = Math.abs(nLocation - start);
            answer[i]=distance;
        }
        start=answer[0];
        for(int i=1;i<n;i++){
            start = gcd(start,answer[i]);
        }
        System.out.println(start);
    }
    public static int gcd(int a, int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}
