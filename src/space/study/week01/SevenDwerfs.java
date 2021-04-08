package space.study.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SevenDwerfs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] heights = new int[9];
        int sumOfHeights = 0;
        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            sumOfHeights += heights[i];
        }
        for (int i = 0; i < 9; i++) {
            if (sumOfHeights == 100)
                break;
            if (sumOfHeights - heights[i] >= 100) {
                for (int j = 0; j < 9; j++) {
                    if (j == i)
                        continue;
                    if (sumOfHeights - heights[i] - heights[j] == 100) {
                        sumOfHeights -= heights[i] - heights[j];
                        heights[i] = 0;
                        heights[j] = 0;
                        break;
                    }
                }
            }
        }
//        Arrays.sort(heights);
        for (int i = 0; i < 9; i++) {
            int min = heights[i];
            for (int j = i+1; j < 9; j++) {
                if(min>heights[j]){
                    min = heights[j];
                    heights[j] = heights[i];
                    heights[i]=min;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (heights[i] != 0)
                System.out.println(heights[i]);
        }
    }
}
