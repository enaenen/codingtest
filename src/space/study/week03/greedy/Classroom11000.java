package space.study.week03.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Classroom11000 {
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxEndTime = 0;
        int count = 1;

        for (int i = 0; i < n; i++) {
            int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int startTime = inputs[0];
            int endTime = inputs[1];

            if (maxEndTime <= startTime)
                maxEndTime = endTime;
            else
                count++;
        }
        System.out.println(count);
    }

    순서대로 입력된다는 보장이없다. 따라서 틀림
     */


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int[] startTimes = new int[n];
        int[] endTimes = new int[n];

        for (int i = 0; i < n; i++) {
            int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            startTimes[i] = inputs[0];
            endTimes[i] = inputs[1];
        }

        System.out.println(count);
    }
}
