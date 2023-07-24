package space.leetcode.leetcode75.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        List<Boolean> first = kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        for (Boolean ans : first) {
            System.out.print(ans + " ");
        }
        System.out.println();

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int maxCandyQuantity = 0;
        for(int i = 0; i < candies.length; ++i){
            maxCandyQuantity = Math.max(maxCandyQuantity, candies[i]);
        }
        for (int candy : candies) {
            if (maxCandyQuantity <= candy + extraCandies)
                answer.add(true);
            else
                answer.add(false);
        }
        return answer;
    }
}
