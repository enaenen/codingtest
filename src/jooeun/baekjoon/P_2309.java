package jooeun.baekjoon;

// https://www.acmicpc.net/problem/2309
// -> 일곱난장이가 아홉 난장이가 됨. 일곱 난장이의 키 합이 100일때, 누가 일곱 난장이인지 구하여라

import java.util.Arrays;

public class P_2309 {

    static int height_sum;
    static int num;
    static boolean isFirst;
    static int[] who_in;

    public static void main(String[] args){

        int[] heights = {20, 7, 23, 19, 10, 15, 25, 8, 13};
        height_sum = 100;
        num = 7;
        isFirst = true;

        int[] visited = new int[heights.length];
        Arrays.fill(visited, 0);

        pick(0, heights, 0, 0, visited);

        for(int i : who_in){
            System.out.print(i + "   ");
        }

    }

    public static void pick(int idx, int[] nums, int pick_num, int sum, int[] visited){

        if(isFirst == false){
            return;
        }

        if(pick_num == num){

            if(sum == height_sum && isFirst){

                who_in = new int[num];

                int who_idx = 0;

                for(int i = 0 ; i < visited.length; i++){

                    if(visited[i] == 1){
                        who_in[who_idx] = nums[i];
                        who_idx++;
                    }

                }

                Arrays.sort(who_in);

                isFirst = false;
            }

            return ;
        }

        if(idx >= nums.length){
            return ;
        }

        // 뽑고 다음 Pick 호출
        visited[idx] = 1;
        pick(idx + 1, nums, pick_num + 1, sum + nums[idx], visited);

        // 안뽑고 다음 Pick 호출
        visited[idx] = 0;
        pick(idx + 1, nums, pick_num, sum,visited);
    }
}
