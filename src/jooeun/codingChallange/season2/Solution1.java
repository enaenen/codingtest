package jooeun.codingChallange.season2;

public class Solution1 {

    public static void main(String[] args){

        int n = 125;
        int answer = solution(n);

        System.out.println(answer);

    }

    static public int solution(int n) {

        int answer = 0;
        int idx = 0;
        int target = n;
        int[] arr = new int[1000];

        while(target > 0){

            arr[idx++] = target % 3 ;
            target /= 3;

        }

        int cnt = --idx;

        for(int i = 0; i <= cnt ; i++){
            answer += Math.pow(3, idx--) * arr[i];
        }

        return answer;
    }
}
