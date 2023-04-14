package space.programmers.lv0;

import java.util.ArrayList;

public class Parrallel {
    public static int solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < dots.length - 1; ++i) {
            if (answer == 1)
                break;
            else {
                for (int j = i + 1; j < dots.length; ++j) {
                    double slope = (double) ((dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]));
                    if (list.contains(slope)) {
                        answer = 1;
                        break;
                    } else {
                        list.add(slope);
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] dots1 = new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int[][] dots2 = new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        System.out.println(solution(dots1));
        System.out.println(solution(dots2));
    }
}
