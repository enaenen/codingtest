package space.leetcode.leetcode75.medium;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] answer;

        answer = productExceptSelf(new int[]{1, 2, 3, 4});
//        answer = productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int multiply = 1;
        int countZero = 0;

        for (int i : nums) {
            if (i == 0) {
                countZero++;
                continue;
            }
            multiply *= i;
        }
        if (1 < countZero) {
            for (int i = 0; i < result.length; ++i) {
                result[i] = 0;
            }
        } else {
            for (int i = 0; i < result.length; ++i) {
                if (nums[i] != 0 && countZero == 0)
                    result[i] = multiply / nums[i];
                else if (nums[i] != 0)
                    result[i] = 0;
                else
                    result[i] = multiply;
            }
        }
        return result;
    }
}

