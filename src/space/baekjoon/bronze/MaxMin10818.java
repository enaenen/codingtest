package space.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int i=0;
        int minimum=1000000;
        int maximum = -1000000;
        while (i < cases){
            int n = Integer.parseInt(inputs[i]);
            if(maximum < n)
                maximum = n;
            if (minimum > n)
                minimum = n;
            i++;
        }
        System.out.println(minimum + " " +maximum);
    }
}
