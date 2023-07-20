package space.leetcode.prac;

/**
 *
 * https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();


        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                int tmp = nums[index];
                nums[index++] = nums[i];
                nums[i] = tmp;
            }
        }
    }
}
