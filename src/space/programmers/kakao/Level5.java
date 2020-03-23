package space.programmers.kakao;

public class Level5 {
    public static void main(String[] args) {

        int[] x = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
       System.out.println(solution(x,3));
    }

    public static int solution(int[] stones, int k) {
        int answer = 0;
        int cnt = 1;

        while(true){
            for(int i  = 0; i < stones.length ;i++){
                if(cnt > k ){
                    break;
                }
                if(stones[i] > 0){
                    stones[i]--;
                    cnt = 1;
                }
                else{
                    cnt++;
                }

            }
            if(cnt > k){
                break;
            }else{
                cnt = 1;
                answer++;
            }
        }
        return answer;
    }
}
