package space.programmers;

public class Base124Best {
    public static void main(String[] args) {
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
        System.out.println(solution(6));
        System.out.println(solution(7));
        System.out.println(solution(8));
        System.out.println(solution(9));
        System.out.println(solution(10));
    }
    // 0123456789 => 10개
    // 10진수에서 10으로 나누면 맨앞자리를 가져온다
    // 3진수일경우 012 세개지만 여기서는 1,2,4로 표현하고 0이없다
    // 따라서 n을 당겨주고 /3을한다.
    // 원래 10진수체계에서는 숫자를 올리고 10 이 되는데
    // 124는 0이 없기때문에 자리가 올리가게 될경우(3인경우) 그 과정을 생략하기 위해서 n-1을한다.
    public static String solution(int n) {
        String answer = "";
        String number[] = {"4", "1", "2"};

        while (n > 0) {
            answer = number[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }
}
