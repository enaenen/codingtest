package space.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine();
        int answer = 0;
        int arr[] = new int[10];
        int maxNumber = 0;

        for (int i = 0; i < roomNumber.length(); i++)
            arr[roomNumber.charAt(i) - '0']++;

        for (int i = 0; i < 10; i++) {
            if (arr[maxNumber] < arr[i])
                maxNumber = i;
        }

        if ((arr[6] != arr[9]) && (maxNumber == 6 || maxNumber == 9)) {
            int sixAndNineCount = 0;
            sixAndNineCount = arr[6] + arr[9];
            answer = sixAndNineCount / 2 + sixAndNineCount % 2;
        } else
            answer = arr[maxNumber];
        System.out.println(answer);
    }
}
