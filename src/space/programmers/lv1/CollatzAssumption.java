package space.programmers.lv1;

public class CollatzAssumption {
    public static void main(String[] args) {
        System.out.println(solution(6) + "\t" + 8);
        System.out.println(solution(16) + "\t" + 4);
        System.out.println(solution(626331) + "\t" + -1);
    }

    public static int solution(int num) {
        int answer = 0;
        long n = num;

        while (1 != n && answer < 500) {
            if (n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
            ++answer;
        }

        if (answer == 500)
            return -1;
        else
            return answer;
    }
}
