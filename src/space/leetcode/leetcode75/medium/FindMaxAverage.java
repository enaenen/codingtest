package space.leetcode.leetcode75.medium;
//https://leetcode.com/problems/maximum-average-subarray-i/submissions/?envType=study-plan-v2&envId=leetcode-75
public class FindMaxAverage {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        FindMaxAverage findMaxAverage = new FindMaxAverage();
        System.out.println(findMaxAverage.findMaxAverage(nums, k));
    }
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxSum = 0;

        if ( k == 1 && nums.length == 1)
            return nums[0];

        for (int i = 0; i < k; ++i){
            sum += nums[i];
        }
        maxSum = sum;

        for(int i = k; i < nums.length; ++i){
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(sum, maxSum);
        }

        return (maxSum / (k * 1.0d));
    }
}
