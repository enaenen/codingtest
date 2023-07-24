package space.leetcode.leetcode75.medium;

public class MaxArea {
    public static void main(String[] args) {
        System.out.println("answer = 49 : "+ maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println("answer = 1 : "+ maxArea(new int[] {1,1}));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while ( left < right ) {
            int level = Math.min(height[left], height[right]);
            max = Math.max(max, (right - left) * level);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
