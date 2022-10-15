package space.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int total = Arrays.stream(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()).sum();
            if (total == 4)
                System.out.println('E');
            else if (total == 3)
                System.out.println('A');
            else if (total == 2)
                System.out.println('B');
            else if (total == 1)
                System.out.println('C');
            else
                System.out.println('D');
        }
    }

}
