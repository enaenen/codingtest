package jooeun.codingtest.gabia2021;

import java.math.BigInteger;

public class Solution1 {

    public static void main(String[] args){
        int n = 10;

        System.out.println(solution(n));

    }

    public static int solution(int n){

        // 끝자리에 0 -> 2 * 5, 10 -> 5의 배수들이 몇개인지 체크한다
        int cnt_zero = 0;

        // 가장 큰 5의 거듭제곱 수 찾기
        int maxFive = (int)Math.pow(5,Math.floor(Math.log(n) / Math.log(5)));

        for(int i = 5; i <= maxFive; i*=5){
            cnt_zero += n/i;
        }

        return cnt_zero;
    }

//    public static int solution(int n){
//
//        String str = "" + dfs(new BigInteger(n+""), new BigInteger("1"));
//        int idx = str.length() - 1;
//
//        while(str.charAt(idx) == '0')
//            idx--;
//
//
//        return str.length() - 1 - idx;
//    }
//
//    public static BigInteger dfs(BigInteger n, BigInteger num){
//
//        if(n.compareTo(num) == 0)
//            return num;
//        else
//            return dfs(n, num.add(new BigInteger("1"))).multiply(num);
//    }

}
