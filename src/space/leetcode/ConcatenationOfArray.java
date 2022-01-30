package space.leetcode;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int [nums.length * 2];

        for(int i=0; i<result.length; i++){
            result[i] = nums[i%nums.length];
        }
        return result;
    }

    public static void main(String[] args) {
        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        int[] concatenation = concatenationOfArray.getConcatenation(new int[]{1, 2, 1});
        for (int i : concatenation) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("1, 2, 1, 1, 2, 1");

    }
}
