package space.programmers.lv1;

import java.util.Arrays;

public class MemorialScore {
    public static void main(String[] args) {
        String[] names = new String[]{"may", "kein", "kain", "radi"};
        int[] solution = solution(names,
                new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}
                        , {"kon", "kain", "may", "coni"}});
        for (int i : solution) {
            System.out.println(i);
        }

    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; ++i) {
            for (int j = 0; j < photo[i].length; ++j) {
                if (Arrays.asList(name).indexOf(photo[i][j]) != -1)
                    answer[i] += yearning[Arrays.asList(name).indexOf(photo[i][j])];
            }
        }
        return answer;
    }
}
