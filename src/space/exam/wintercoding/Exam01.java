package space.exam.wintercoding;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
    정규식
    같은문자열 * 처리


 */
public class Exam01 {
    public static String solution(String line) {
        Queue<Character> que = new LinkedList<Character>();
        for (char c : line.toCharArray()) {
            que.add(c);
        }
        StringBuilder answer = new StringBuilder();
        char previous = 0;
        char current = 0;
        while (!que.isEmpty()){
            char poped = que.poll();
            if (previous == poped && current != '*'){
                previous = poped;
                answer.append("*");
                current='*';
            }
            else if (previous == poped && current == '*'){
                continue;
            }
            else {
                answer.append(poped);
                previous = poped;
                current = 0;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("aabbc") + " == " + "a*b*c");
        System.out.println(solution("hellllllllo") + " == " + "hel*o");
        System.out.println(solution("wonderful") + " == " + "wonderful");
    }
}
