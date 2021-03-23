package space.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KDivisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int i = 1;
        int count=0;

        while (i <= n){
            if(n%i==0)
                count++;
            if(count==k)
                break;
            i++;
        }
        if(count < k)
            System.out.println(0);
        else
            System.out.println(i);
    }
}
