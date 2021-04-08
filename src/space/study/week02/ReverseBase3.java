package space.study.week02;

/**
 * 21-04-07
 * 삼진법 뒤집기
 * https://programmers.co.kr/learn/courses/30/lessons/68935
 */
public class ReverseBase3 {
    public static void main(String[] args) {
        solution(9);

        System.out.println(solution(45));
        System.out.println(solution(125));
    }

    public static int solution(int n) {
        String base3 = "" + toBase3(n);
        System.out.println("base3 = " + base3);
        int base10 = (int) toBase10(base3);
        return base10;
    }

    public static long toBase3(int n) {
        long base3 = 0;
        //n > 3이면 왜 안되나?
        //n 이 9일때, 3으로 나누면 몫이 3, 3보다 크다에 안걸려서 밑에서 0을 더한다. 숫자가 날라감
        if (n > 0)//n > 3이면 왜 안되나?
            base3 = toBase3(n / 3);
        base3 = base3 * 10 + (n % 3);

        return base3;
    }

    public static long toBase10(String n) {
        long base10 = 0;
        long base = 1;
        for (int i = 0; i < n.length(); i++) {
            base10 += Integer.parseInt("" + n.charAt(i)) * base;
            base *= 3;
        }
        return base10;
    }

    public int solution2(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3);
    }

}