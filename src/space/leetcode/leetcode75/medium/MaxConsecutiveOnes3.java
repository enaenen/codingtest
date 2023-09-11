package space.leetcode.leetcode75.medium;

public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int[] nums2 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1};

        int k = 2;

        int result = longestOnes(nums, k);
        int result2 = longestOnes(nums2, k);

        System.out.println(result);
        System.out.println(result2);
    }

    public static int longestOnes(int[] nums, int k) {
        int maxRange = Integer.MIN_VALUE;
        int start = 0, end = 0;

        while (end < nums.length) {
            int acceptableZero = k;

            if (nums[end] == 0)
                acceptableZero--;
            end++;
            if (acceptableZero < 0){

            }
            else {
                while (acceptableZero > 0) {
                    --acceptableZero;
                    ++end;
                }
            }
            maxRange = Math.max(maxRange, (end - start));
        }
        return maxRange;
    }
}