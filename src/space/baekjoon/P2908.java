package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2908 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxNum=0;
        while(st.hasMoreTokens()){
            int firstNumber = Integer.parseInt(st.nextToken());
            int reversedNumber=0;
            reversedNumber+=(firstNumber%10)*100;
            reversedNumber+=((firstNumber/10)%10)*10;
            reversedNumber+=(firstNumber/100);
            if(maxNum<reversedNumber) maxNum=reversedNumber;
        }
        System.out.println(maxNum);
    }
}
