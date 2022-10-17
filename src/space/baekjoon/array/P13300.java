package space.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int studentTotal = Integer.parseInt(input[0]);
        int roomLimit = Integer.parseInt(input[1]);
        int student[][] = new int[6][2];

        for (int i = 0 ; i < studentTotal; i++){
            String[] s = br.readLine().split(" ");
            student[Integer.parseInt(s[1]) - 1][Integer.parseInt(s[0])]++;
        }
        studentTotal = 0;
        for(int i =0 ; i < 6; i++){
            studentTotal+= student[i][0] / roomLimit;
            if (student[i][0] % roomLimit != 0)
                studentTotal++;
            studentTotal+= student[i][1] / roomLimit;
            if (student[i][1] % roomLimit != 0)
                studentTotal++;
        }
        System.out.println(studentTotal);
    }
}
