package jooeun.LeetCode;

//https://leetcode.com/problems/two-sum/

public class TwoSum {

    public static void main(String[] args){

        int[] nums = {3,2,4};
        int target = 6;

        int[] answer = solution(nums, target);
        System.out.println("first : " + answer[0] + ", second : " + answer[1]);

    }

    public static int[] solution(int[] nums, int target){

        for(int idx_1 = 0 ; idx_1 < nums.length; idx_1++){

            for(int idx_2 = idx_1 + 1; idx_2 < nums.length; idx_2++){

                if(nums[idx_1] + nums[idx_2] == target) {

                    return new int[]{idx_1, idx_2};
                }
            }
        }

        return new int[]{0,0};
    }

}
