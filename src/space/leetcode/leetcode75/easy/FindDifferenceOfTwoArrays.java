package space.leetcode.leetcode75.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDifferenceOfTwoArrays {
    public static void main(String[] args) {
        List<List<Integer>> difference = findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});
        for (List<Integer> integers : difference) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i,1);
        }
        for (int i : nums2) {
            if (map.get(i) != null)
                map.put(i,-1);
            map.put(i, 2);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == -1)
                continue;
        }


        return result;
    }
}
