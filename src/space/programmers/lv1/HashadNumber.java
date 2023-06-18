package space.programmers.lv1;

public class HashadNumber {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }
    public static boolean solution(int x) {
        boolean answer = true;
        int n = x;
        int sum = 0;
        while (0 < n){
            sum += n % 10;
            n /= 10;
        }
        if (x % sum != 0){
            answer = false;
        }
        return answer;
    }
}
