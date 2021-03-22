package jooeun.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args){

        int[] nums1 = {1,3};
        int[] nums2 = {2};

        double answer = solution(nums1, nums2);
        System.out.println("ANSWER : "+ answer);

    }

    public static double solution(int[] nums1, int[] nums2){
        List<Integer> numsList = new ArrayList<>();

        for(int i : nums1)
            numsList.add(i);

        for(int i : nums2)
            numsList.add(i);

        Collections.sort(numsList);

        int len = numsList.size();
        if(len % 2 == 0){
            return ((double)numsList.get(len/2) + numsList.get(len/2 - 1))/2;
        }else{
            return (double)numsList.get(len/2);
        }
    }

}
