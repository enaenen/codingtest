package space.inflearn.java.section2.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BigNumberPrintRe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int prevMax = 0;
        for (int num : arr) {
            if (prevMax < num) {
                System.out.print(num + " ");
            }
            prevMax = num;
        }
    }
}
