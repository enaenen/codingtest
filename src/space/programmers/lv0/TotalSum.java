package space.programmers.lv0;

import com.sun.media.sound.SoftLanczosResampler;

import java.util.Arrays;

public class TotalSum {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int currentTotal = -1;
        int cnt;

        if (total - num <= 0)
            cnt = -num;
        else
            cnt = 0;

        while (currentTotal != total){
            for(int i = 0; i < num; i++){
                answer[i] = cnt + i;
            }
            currentTotal=Arrays.stream(answer).sum();
            cnt++;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static  void printArr(int[] arr){
        for (int i : arr) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printArr(solution(3, 12));
        printArr(solution(5, 15));
        printArr(solution(4, 14));
        solution(5, 5);
        printArr(solution(5, 5));

    }

}
