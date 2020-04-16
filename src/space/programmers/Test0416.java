package space.programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test0416 {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] inputNumbers = br.readLine().split(" ");

            int a = Integer.parseInt(inputNumbers[0]);
            int b = Integer.parseInt(inputNumbers[1]);


            for(int i=0;i<b;i++){
                for(int j=0;j<a;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }