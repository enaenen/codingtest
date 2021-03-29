package space.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Nnumber2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        int[] numbers = new int[10];

        while (cases-->0){
            String[] inputs = br.readLine().split(" ");
            for(int i =0;i<10;i++) {
                numbers[i] = Integer.parseInt(inputs[i]);
            }
            Arrays.sort(numbers);
            System.out.println(numbers[7]);
        }
    }
}
