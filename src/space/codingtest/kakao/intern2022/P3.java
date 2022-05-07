package space.codingtest.kakao.intern2022;

import java.util.ArrayList;
import java.util.List;

public class P3 {
    /**
     * problems[n][0] : alp_req
     * problems[n][1] : cop_req
     * problems[n][2] : alp_rwd
     * problems[n][3] : cop_rwd
     * problems[n][4] : cost
     */

    public static int solution(int alp, int cop, int[][] problems) {
        int cost = 0;
        int maxRequireAlp = -1;
        int maxRequireCop = -1;
        int minRequireAlp = 151;
        int minRequireCop = 151;

        for (int[] problem : problems) {
            maxRequireAlp = Integer.max(maxRequireAlp, problem[0]);
            maxRequireCop = Integer.max(maxRequireCop, problem[1]);
            minRequireAlp = Integer.min(minRequireAlp, problem[0]);
            minRequireCop = Integer.min(minRequireCop, problem[1]);
        }

        while (alp < maxRequireAlp && cop < maxRequireCop) {
            boolean isSolved = false;
            int currentReqAlp;
            int currentReqCop;

            for (int i = 0; i < problems.length; i++) {
                if (problems[i][0] <= alp && problems[i][1] <= cop && 0 < (problems[i][2] + problems[i][3]) - cost) {
                    alp += problems[i][2];
                    cop += problems[i][3];
                    cost += problems[i][4];
                    isSolved = true;
                }
            }
            if (!isSolved) {
                if (minRequireAlp < alp && cop <= minRequireCop) {
                    cop++;
                    cost++;
                } else if (minRequireCop <= cop && alp < minRequireAlp) {
                    alp++;
                    cost++;
                } else {
                    alp++;
                    cop++;
                    cost += 2;
                }
            }
        }
//        cost++;
        return cost;
    }

    public static void main(String[] args) {
        int[][] problems = {
                {10, 15, 2, 1, 2},
                {20, 20, 3, 3, 4}
        };
        int[][] problems2 = {
                {0, 0, 2, 1, 2},
                {4, 5, 3, 1, 2},
                {4, 11, 4, 0, 2},
                {10, 4, 0, 4, 2}
        };
        System.out.println(solution(10, 10, problems));
        System.out.println(solution(0, 0, problems2));
    }
}
