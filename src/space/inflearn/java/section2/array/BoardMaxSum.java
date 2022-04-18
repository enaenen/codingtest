package space.inflearn.java.section2.array;

import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/02-09
 * <p>
 * 9. 격자판 최대합
 * 설명
 * <p>
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 * <p>
 * <p>
 * 입력
 * 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 * <p>
 * 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * <p>
 * <p>
 * 출력
 * 최대합을 출력합니다.
 * <p>
 * 5
 * 10 13 10 12 15
 * 12 39 30 23 11
 * 11 25 50 53 15
 * 19 27 29 37 27
 * 19 13 30 13 19
 * <p>
 * 155
 */
public class BoardMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        System.out.println("================");
        solution(board);
        System.out.println("================");

        int max = 0;
        int sum;
        //가로 확인
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++)
                sum += board[i][j];
            if (max < sum)
                max = sum;
        }
        //세로 확인
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++)
                sum += board[j][i];
            if (max < sum)
                max = sum;
        }
        //대각선 확인
        sum = 0;
        for (int i = 0; i < n; i++)
            sum += board[i][i];
        if (max < sum)
            max = sum;
        System.out.println(max);
    }

    public static void solution(int[][] board) {
        int xSum;
        int ySum;
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
           xSum = 0;
           ySum = 0;
            for (int j = 0; j < board.length; j++){
                xSum += board[i][j];
                ySum += board[j][i];
            }
            answer = Math.max(answer, xSum);
            answer = Math.max(answer, ySum);
        }
        xSum = 0;
        for (int i = 0; i <board.length; i++){
            xSum += board[i][i];
        }
        answer = Math.max(answer, xSum);
        System.out.println(answer);
    }
}
