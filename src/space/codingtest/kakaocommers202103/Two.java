package space.codingtest.kakaocommers202103;

public class Two {
    public static void main(String[] args) {
        int[][] needs = new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}, {1, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        int[][] needs2 = new int[][]{{1, 0, 0}, {1, 0, 0}, {1, 0, 0}, {1, 0, 0}, {1, 0, 0}, {1, 0, 0}};
        int r = 2;
        System.out.println(solution(needs2, r));
    }

    public static int solution(int[][] needs, int r) {
        int answer = 0;
        int[] needParts = new int[15];
        int[] slot = new int[r];

        for (int i = 0; i < needs.length; i++) {
            for (int j = 0; j < needs[0].length; j++) {
                if (needs[i][j] == 1)
                    needParts[j]++;
            }
        }

        for (int i = 0; i < r; i++) {
            int max = 0;
            for (int j = 0; j < 15; j++) {
                if (needParts[max] < needParts[j])
                    max = j;
            }
            slot[i] = max;
            needParts[max] = 0;
        }

        for (int i = 0; i < needs.length; i++) {
            for (int partNum : slot) {
                needs[i][partNum] = 0;
            }
        }

        for (int i = 0; i < needs.length; i++) {
            int count = 0;
            for (int j = 0; j < needs[0].length; j++) {
                if (needs[i][j] != 0)
                    break;
                else if (needs[i][j] == 0)
                    count++;
            }
            if (count == needs[i].length)
                answer++;
        }
        return answer;
    }
}
