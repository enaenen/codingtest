package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2292 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum=1;
        int i;
        for(i =1;i<=n;i++){
            //i == 최소 지나야하는 수
            //sum == i가 나오는 범위 2일경우 2~7
            sum+=(i-1)*6;
            // 입력한 수 n 이 sum 과 같거나 범위보다 작아진다면 탈출
            if(n<=sum) break;
        }
        System.out.println(i);
    }
}
