package space.study.week03.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int total = 0;
        int previous = 0;

        Arrays.sort(inputs);
        for (int num : inputs) {
            total += previous + num;
            previous += num;
        }
        System.out.println(total);
    }
}
