/*
https://programmers.co.kr/learn/courses/30/lessons/12912
 */
package space.programmers.level1;

public class BetweenTwoNumberSum {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }
    public static long solution(int a, int b) {
        if(a==b)
            return a;
        int start, end;
        long answer = 0;
        if(a < b) {
            start = a;
            end = b;
        }
        else {
            start = b;
            end = a;
        }
        for(int i=start;i<=end;i++)
            answer+=i;
        return answer;
    }
}
