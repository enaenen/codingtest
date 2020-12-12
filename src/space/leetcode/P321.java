package space.leetcode;

import java.util.Arrays;
import java.util.Collections;

/*
https://leetcode.com/problems/create-maximum-number/
20-10-19
 */
public class P321 {
    public static void main(String[] args) {
        for(int a : maxNumber(new int[] {3,4,6,5}, new int[] {9,1,2,5,8,3}, 5)){
            System.out.println(a);
        }
    }
    public static int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int[] answer = new int[k];
        //9 8 5 3 2 1
        //6 5 4 3
        Integer[] num1 = Arrays.stream(nums1).boxed().toArray(Integer[]::new);
        Integer[] num2 = Arrays.stream(nums1).boxed().toArray(Integer[]::new);
        Arrays.sort(num1, Collections.reverseOrder());
        Arrays.sort(num2, Collections.reverseOrder());



        return answer;
    }
}
