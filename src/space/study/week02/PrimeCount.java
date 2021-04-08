package space.study.week02;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/12921
 * 소수 찾기
 */
public class PrimeCount {
    public int solution(int n) {

        int answer = 0;
        boolean[] range = new boolean[n+1];
        range[0]=true;
        range[1]=true;
        for(int i=2;i*i <= n;i++){
            if(range[i])
                continue;
            for(int j=i+i; j<=n; j+=i)
                range[j]=true;
        }
        for (boolean isPrime : range){
            if(!isPrime)
                answer++;
        }
        return answer;
    }
}
