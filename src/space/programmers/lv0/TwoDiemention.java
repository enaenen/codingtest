package space.programmers.lv0;

public class TwoDiemention {
    public static void main(String[] args) {
        int[][] solution = solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2);
        for (int[] ints : solution) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
            System.out.println();
        }
    }
    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < num_list.length; ++i){
            if (secondIndex < n) {
                answer[firstIndex][secondIndex++] = num_list[i];
            }
            else {
                secondIndex = 0;
                firstIndex++;
                answer[firstIndex][secondIndex++] = num_list[i];
            }
        }
        return answer;
    }
}
