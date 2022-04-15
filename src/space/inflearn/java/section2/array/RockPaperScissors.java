package space.inflearn.java.section2.array;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aMove = new int[n];
        int[] bMove = new int[n];

        for (int i = 0; i < n ; i++){
            aMove[i] = sc.nextInt();
        }
        for (int i = 0; i < n ; i++){
            bMove[i] = sc.nextInt();
        }
        solution(n, aMove, bMove);

        //1 : 가위
        //2 : 바위
        //3 : 보
        for (int i = 0; i < n ; i++) {
            if (aMove[i] == bMove[i])
                System.out.println("D");
            else if (aMove[i] == 1)
            {
                if (bMove[i] == 2)
                    System.out.println("B");
                if (bMove[i] == 3)
                    System.out.println("A");
            }
            else if (aMove[i] == 2)
            {
                if (bMove[i] == 1)
                    System.out.println("A");
                if (bMove[i] == 3)
                    System.out.println("B");

            }
            else if (aMove[i] == 3)
            {
                if (bMove[i] == 1)
                    System.out.println("B");
                if (bMove[i] == 2)
                    System.out.println("A");
            }
        }
    }
    public static void solution(int n, int[] a, int[] b){
        for (int i = 0; i < n ; i++){
            if (a[i] == b[i])
                System.out.println("D");
            else if (a[i] == 1 && b[i] == 3) System.out.println("A");
            else if (a[i] == 2 && b[i] == 1) System.out.println("A");
            else if (a[i] == 3 && b[i] == 2) System.out.println("A");
            else System.out.println("B");
        }
    }
}
