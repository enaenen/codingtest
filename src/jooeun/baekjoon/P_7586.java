package jooeun.baekjoon;

import java.io.*;
import java.util.*;

public class P_7586 {

    static int n;
    static int[][] info;
    static int[] answer;

    public static void  main(String[] args){

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//
//        info = new int[n][2];
//
//        for(int i = 0 ; i < n ; i++){
//        st = new StringTokenizer(br.readLine());
//            for(int j = 0 ;  j < 2 ; j++){
//
//                map[i][j] = Integer.parseInt(st.nextToken());
//
//            }
//        }

        n = 5;
        info = new int[][]{{55,185},{58,183},{88,186},{60,175},{46,155}};
        answer = new int[n];

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < n ; j++){

                if(i != j){

                    if(info[i][0] < info[j][0] && info[i][1] < info[j][1])
                        answer[i]++;

                }
            }

        }

        for(int i = 0 ; i < n ; i++)
            System.out.print((answer[i] + 1 )+ " ");

    }
}

