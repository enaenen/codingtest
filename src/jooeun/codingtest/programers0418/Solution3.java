package jooeun.codingtest.programers0418;

public class Solution3 {

    static int res = 0;
    static int[] numbers;
    static int k;

    static int len;

    static public void main(String[] args){
        int[] numbers = new int[]{10, 40, 30, 20};
        int k = 20;

        solution(numbers,k);

    }

    static public int solution(int[] numbers, int K) {

        Solution3.numbers = numbers;
        Solution3.k = K;

        len = numbers.length;

        dfs(0,0);

        if(res == 0)
            res = -1;

        return res;
    }

    static void dfs(int idx,int cnt){

        if(idx == len-1){

            if(res > cnt){
                res = cnt;
            }

            return;
        }

        if(Math.abs(numbers[idx] - numbers[idx+1]) <= k){
            dfs(idx+1,cnt);
        }else{



        }


    }
}
