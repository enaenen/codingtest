package space.programmers.mockexam;

import java.util.HashMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/118666?language=java
public class KakaoIntern2020 {
    public static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);
        for (int i = 0; i < survey.length; ++i) {
            if (choices[i] < 4)
                map.put(survey[0], map.get(survey[0]) + choices[i] % 4);
            else if ( 4 < choices[i])
                map.put(survey[1], map.get(survey[1] + choices[i] % 4));
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println("TCMA = " + solution(new String[]{"AN", "CF", "MJ", "RF", "NA"}, new int[]{5, 3, 2, 7, 5}));
        System.out.println("RCJA = " + solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3}));
    }
}
