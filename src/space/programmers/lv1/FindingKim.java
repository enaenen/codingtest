package space.programmers.lv1;

import java.util.Arrays;

public class FindingKim {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }
    public static String solution(String[] seoul) {
        return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
    }
}
