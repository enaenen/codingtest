package jooeun.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P_1463 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();

        int result = solution(n);

        System.out.println("MIN VALUE : " + result);
    }

    public static int solution(int n){

        int[] ary = new int[n + 1];

        Arrays.fill(ary, 0);

        int n1;
        int n2;
        int n3;

        for(int i = 2 ; i <= n ; i++){

            n1 = Integer.MAX_VALUE;
            n2 = Integer.MAX_VALUE;

            if(i % 2 == 0){
                n1 = ary[n/2] + 1;
            }

            if(i % 3 == 0){
                n2 = ary[n/3] + 1;
            }

            n3 = ary[i-1] + 1;

            ary[i] = Math.min(n1, n2);
            ary[i] = Math.min(ary[i], n3);

        }

        return ary[n];
    }
}
