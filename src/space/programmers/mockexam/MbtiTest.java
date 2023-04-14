package space.programmers.mockexam;

import java.util.HashMap;
/*
https://school.programmers.co.kr/learn/courses/30/lessons/118666
 */
public class MbtiTest {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"AN","CF","MJ","RT","NA"}, new int[] {5,3,2,7,5}));
    }
    public static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R',0);
        map.put('T',0);
        map.put('C',0);
        map.put('F',0);
        map.put('J',0);
        map.put('M',0);
        map.put('A',0);
        map.put('N',0);
        for(int i = 0; i < survey.length; ++i){
            char type = survey[i].charAt(0);
            if (choices[i] < 4) {
                int score = choices[i] - 4;
                map.put(type, map.getOrDefault(type, 0) + Math.abs(score));
            }
            else if (choices[i] > 4){
                int score = choices[i] % 4;
                map.put(type, map.getOrDefault(type, 0) - score);
            }
            else
                map.put(type, map.getOrDefault(type, 0));
        }
        if (map.get('R') < map.get('T'))
            answer.append('T');
        else
            answer.append('R');

        if (map.get('C') < map.get('F'))
            answer.append('F');
        else
            answer.append('C');

        if (map.get('J') < map.get('M'))
            answer.append('M');
        else
            answer.append('J');

        if (map.get('A') < map.get('N'))
            answer.append('N');
        else
            answer.append('A');

        return answer.toString();
    }
}
