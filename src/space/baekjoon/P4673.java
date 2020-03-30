/*
https://www.acmicpc.net/problem/4673

 */
package space.baekjoon;

public class P4673 {
    public static void main(String[] args){
        boolean map[] = new boolean[10001];
        for(int i=1;i<10001;i++){
            int index = solution(i);
            if(index <= 10000){
                map[index]=true;
            }
        }
        for(int i=1;i<10001;i++){
            if(!map[i]) System.out.println(i);
        }
    }
    public static int solution(int n){
        int sum=n;
        while(true){
            if(n==0) break;
            //1의 자리를 계속 더한다
            sum+=n%10;
            //1의 자리에 10, 100, 1000 ,...n 자리 숫자를 넣어서 %10을 했을때 sum에 더해질 수 있도록 한다.
            n/=10;
        }
        return sum;
    }
}
