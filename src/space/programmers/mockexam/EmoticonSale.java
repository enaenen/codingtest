package space.programmers.mockexam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EmoticonSale {
    public static void main(String[] args) {
        int[] one = solution(new int[][]{{40, 10000}, {25, 10000}}, new int[]{7000, 9000});
        for (int i : one) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];
        double[] totalUserPurchaseCost = new double[users.length];
        HashSet<Integer> discountSet = new HashSet<Integer>();

        for (int i = 0; i < users.length; ++i) {
            discountSet.add(users[i][0]);
        }

        double totalCost = 0;
        int passUser = 0;

        for (Integer discountRate : discountSet) {
            passUser = 0;
            totalCost = 0;
            for (int i = 0; i < users.length; ++i) {
                if (users[i][0] <= discountRate) {
                    for (int k = 0; k < emoticons.length; ++k) {
                        double discountedCost = emoticons[k] * ((100 - discountRate) * 0.01);
                        totalUserPurchaseCost[i] += discountedCost;
                        totalCost += totalUserPurchaseCost[i];
                    }
                }
                if (totalUserPurchaseCost[i] >= users[i][1]) {
                    passUser++;
                    totalCost -= totalUserPurchaseCost[i];
                    break;
                }
            }
            if (answer[0] < passUser) {
                answer[0] = passUser;
                answer[1] = (int) totalCost;
            }
        }
        return answer;
    }
}
