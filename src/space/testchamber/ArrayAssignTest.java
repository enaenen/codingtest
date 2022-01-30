package space.testchamber;

public class ArrayAssignTest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(nums.length);
        int[] newNums = new int[nums.length * 2];
        System.out.println(newNums.length);
    }
}
