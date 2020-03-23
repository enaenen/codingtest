package jooeun.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P_1182 {

    static int n;
    static int s;
    static int[] ary;
    static int result = 0;

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        s = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        ary = new int[n];
//        for(int i = 0 ; i< n ; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }

        n = 5;
        s = 0;
        ary = new int[]{-7, -3, -2, 5, 8};

        dfs(0,0);


        if(s == 0){
            System.out.println(result -1);
        }else{
            System.out.println(result);
        }

    }

    static void dfs(int sum,int k){

        if(k == ary.length){

            if(sum == s){
                result++;
            }

            return;
        }

        dfs(sum + ary[k],k+1);
        dfs(sum,k+1);

    }


}
