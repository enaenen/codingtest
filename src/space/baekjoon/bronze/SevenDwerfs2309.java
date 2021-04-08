package space.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SevenDwerfs2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        boolean found = false;
        int[] index = new int[9];

        for (int i = 0; i < 9; i++) {
            index[i] = Integer.parseInt(br.readLine());
            total += index[i];
        }
        for (int i = 0; i < 9; i++) {
            if (found)
                break;
            for (int j = 0; j < 9; j++) {
                if (j == i) continue;
                if (total - index[i] - index[j] == 100) {
                    index[i] = 0;
                    index[j] = 0;
                    found = true;
                    break;
                }
            }
        }
        Arrays.sort(index);
        for (int i : index) {
            if(i==0)
                continue;
            System.out.println(i);
        }
    }
}
