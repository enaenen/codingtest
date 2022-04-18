package space.inflearn.java.section2.review;

import java.util.Scanner;

public class ScoreCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int counter = 0;
        int sum = 0;

        for (int i = 0; i < n ; i++)
            scores[i] =sc.nextInt();
        for (int score : scores) {
            if(score == 1)
                sum += ++counter;
            else
                counter = 0;
        }
        System.out.println(sum);
    }
}
