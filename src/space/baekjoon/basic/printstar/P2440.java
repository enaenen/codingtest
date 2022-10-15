package space.baekjoon.basic.printstar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) ;
        for (int i = 0; i < n; i++){
            for(int j = n - i; 0 < j; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
