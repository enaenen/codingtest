package space.codingtest.kakao.intern2022;

import java.util.HashMap;
import java.util.Map;

public class P1 {
    public static void main(String[] args) {

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        String[] survey2 = {"AN", "AN"};
        int[] choices = {4, 4, 4, 4, 4};
        int[] choices2 = {1, 7};
        String solution = solution(survey, choices);
        System.out.println(solution);
        solution = solution(survey2, choices2);
        System.out.println(solution);
    }

    public static String solution(String[] survey, int[] choices) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        char[] set = {'R', 'C', 'J', 'A'};

        for (int i = 0; i < survey.length; i++) {
            if (0 < choices[i] && choices[i] < 4)
                map.put(survey[i].toUpperCase().charAt(0), map.getOrDefault(survey[i].toUpperCase().charAt(0), 0) + choices[i] * 3 % 4);
            else if (4 < choices[i] && choices[i] < 8)
                map.put(survey[i].toUpperCase().charAt(1), map.getOrDefault(survey[i].toUpperCase().charAt(1), 0) + (choices[i] % 4));
        }

        for (char c : set) {
            if (c == 'R') {
                Integer rCount = map.getOrDefault(c, 0);
                Integer tCount = map.getOrDefault('T', 0);
                if (rCount < tCount)
                    result.append('T');
                else
                    result.append('R');
            } else if (c == 'C') {
                Integer cCount = map.getOrDefault(c, 0);
                Integer fCount = map.getOrDefault('F', 0);
                if (cCount < fCount)
                    result.append('F');
                else
                    result.append('C');
            } else if (c == 'J') {
                Integer jCount = map.getOrDefault(c, 0);
                Integer mCount = map.getOrDefault('M', 0);
                if (jCount < mCount)
                    result.append('M');
                else
                    result.append('J');
            } else{
                Integer aCount = map.getOrDefault(c, 0);
                Integer nCount = map.getOrDefault('N', 0);
                if (aCount < nCount)
                    result.append('N');
                else
                    result.append('A');
            }
        }
        System.out.println(map.get('A') + " " + map.get('N'));

        return result.toString();
    }
}
