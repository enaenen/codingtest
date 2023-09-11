package space.leetcode.leetcode75.medium;
// 구간 구하기 문제
public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int[] nums2 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int[] nums3 = {0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0};

        int k = 2;

        int result = longestOnes(nums, k);
        int result2 = longestOnes(nums2, k);
        int result3 = longestOnes(nums3, k);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static int longestOnes(int[] nums, int k) {
        int start = 0, end = 0, zero = 0;

        while (end < nums.length) {
            if (nums[end] == 0)
                zero++;

            end++;

            if (zero > k) {
                if (nums[start] == 0)
                    zero--;

                start++;
            }
        }
        return end - start;
    }
}