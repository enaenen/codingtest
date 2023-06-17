package space.programmers.lv1;

public class RestOne {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        for (int i = 1; i < 999999; ++i) {
            if (n % i == 1)
                return i;
        }
        return n;
    }

}
