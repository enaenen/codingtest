package jooeun.baekjoon;

import java.io.*;
import java.util.*;

public class P_15649 {

    static int n;
    static int m;
    static ArrayList<String> nums;
    static int[] checked;

    public static void main(String[] args) throws  IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new ArrayList<String>();
        checked = new int[n];

        dfs(0,0,"");


        for(String str : nums)
            System.out.println(str);

    }

    private static void dfs(int k,int cnt, String numbers){

        if(cnt == m){
            nums.add(numbers);
            return;
        }

        if(k ==  n)
            return;

        for(int i = 0 ; i < n ; i++){

            if(checked[i] == 0){
                checked[i] = 1;
                dfs(i, cnt+1, numbers+ (i+1) +" ");
                checked[i] = 0;
            }

        }

        return;
    }
}

