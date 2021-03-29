package space.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitCount3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        while (cases-- > 0 ){
            int n = Integer.parseInt(br.readLine());

            int counter = 0;
            while(n>0){
                if(n%2!=0) {
                    System.out.print(counter);
                    if(n/2<=0)
                        break;
                    System.out.print(" ");
                }
                n/=2;
                counter++;
            }
            System.out.println();
        }
    }
}
