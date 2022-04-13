package space.inflearn.java.section1;

import java.util.Scanner;

public class ExtractInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String word = input.replaceAll("[^0-9]","");
        System.out.println(Integer.parseInt(word));

        solution(input);
        solution2(input);
    }
    public static void solution(String word){
        char[] chars = word.toCharArray();
        int answer = 0;
        for (char c : chars) {
            if ('0' <= c && c <= '9')
                answer = answer * 10 + (c - '0');
        }
        System.out.println(answer);
    }
    public static void solution2 (String word){
        String answer = "";
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c))
                answer += c;
        }
        System.out.println(Integer.parseInt(answer));
    }
}
