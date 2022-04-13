package space.inflearn.java.section1;

import java.util.Scanner;

public class ExtractInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next().replaceAll("[^0-9]","");
        System.out.println(Integer.parseInt(word));
        solution(sc.next());
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
}
