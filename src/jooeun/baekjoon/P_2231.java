package jooeun.baekjoon;

import java.io.*;

public class P_2231 {

    static int n;
    static int answer;
    static int digit;

    public static void main(String[] args)throws IOException{

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());

        n = 216;

        cul_digit();

        dfs(n - 9*digit);

        System.out.println(answer);

    }

    private static void cul_digit(){

        digit = (int)Math.log10(n) + 1;

        return ;
    }

    private static void dfs(int num){

        if(num == n){
            return;
        }

        int result = num;
        int temp = num;
        int digit_n = 0;

        for(int i = digit ; i > 0; i--){
            digit_n = (int)(temp / Math.pow(10,i-1));
            temp -= digit_n * Math.pow(10,i-1);
            result += digit_n;
        }

        if(result == n){
            answer = num;
            return;
        }

        dfs(++num);
    }

}
