package space.programmers;

public class Base124_1 {
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
        String answer = "";
        int cn = n;
        while(cn > 0){
            if (cn %3 ==0) {
                answer = "4"+answer;
                cn--;
            }
            else if(cn %3 ==1)
                answer = "1"+answer;
            else
                answer = "2" + answer;
            cn /= 3;
        }
        return answer;
    }
}
