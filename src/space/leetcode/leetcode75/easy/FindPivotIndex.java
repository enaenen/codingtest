package space.leetcode.leetcode75.easy;

import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
        System.out.println((pivotIndex(new int[] {1, 2, 3})));
        System.out.println(pivotIndex(new int[] {2, 1, -1}));
    }
    public static int pivotIndex(int[] nums) {
        int pivot = 0;
        int leftSum = 0;
        int total = Arrays.stream(nums).sum();

        for (int i = 0; i < nums.length; ++i) {
            pivot = i;
            total -= nums[i];
            if (total == leftSum) {
                return pivot;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
