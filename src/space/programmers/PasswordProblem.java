package space.programmers;

import java.util.*;

public class PasswordProblem {
    public static int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    private static int countUp(int before, int answer) {
        int count = 0;
        while (true) {
            if (numbers[before] == answer) break;

            count++;
            before = numbers[(before + 1) % 10];
        }
        return count;
    }

    private static int countDown(int before, int answer) {
        int count = 0;
        while (true) {
            if (numbers[before] == answer) break;

            count++;
            before = numbers[(before + 9) % 10];
        }
        return count;
    }

    private static int solution(String p, String s) {
        int answer = 0;
        int up;
        int down;
        char[] inputPassword = p.toCharArray();
        char[] answerPassword = s.toCharArray();

        for (int i = 0; i < inputPassword.length; i++) {
            up = countUp(Character.getNumericValue(inputPassword[i]), Character.getNumericValue(answerPassword[i]));
            down = countDown(Character.getNumericValue(inputPassword[i]), Character.getNumericValue(answerPassword[i]));
            answer += Math.min(up, down);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("" + solution("82195", "64723"));

        System.out.println("" + solution("00000000000000000000", "91919191919191919191"));
    }
}