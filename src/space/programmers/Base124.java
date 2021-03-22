package space.programmers;

import java.util.ArrayList;
import java.util.List;

public class Base124 {
    public static void main(String[] args) {
//        System.out.println(solution(1));
//        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
        System.out.println(solution(6));
        System.out.println(solution(7));
        System.out.println(solution(8));
        System.out.println(solution(9));
        System.out.println(solution(10));
    }
    public static String solution(int n) {
        int base[] = {1,2,4};
        String answer = "";
        while(true){
            n -= 1;
            int tmp = n % 3;
            answer = base[tmp] + answer;
            n /= 3;
            if(n <= 0)
                break;
        }
        return answer;
    }
}
