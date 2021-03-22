package space.programmers.search;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    public static void main(String[] args) {
        int[] solution1 = solution(new int[]{1, 2, 3, 4, 5});
        int[] solution2 = solution(new int[]{1, 3, 2, 4, 2});
        System.out.println("solution1 = " + solution1[0]);
        System.out.println("solution2 = " + solution2[0]);
    }

    public static int[] solution(int[] answers) {
        int[] answer = {0};
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        List<int[]> participant = new ArrayList<>();
        participant.add(first);
        participant.add(second);
        participant.add(third);

        for (int[] ints : participant) {
            int count=0;
            for(int i=0;i<answer.length;i++){
                if(ints[i%ints.length]==answers[i])
                    count++;
            }
        }

        return answer;
    }
    public static int compare(int[] sheet, int[] problems,int previousCount){
        int count=0;
        for(int i=0;i<problems.length;i++){
            if(sheet[i%sheet.length]==problems[i]){
                count++;
            }
        }
        return count;
    }
}
