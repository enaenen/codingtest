package space.inflearn.java.section1;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
        char prev = '0';
        int cnt = 1;
        for (int i = 0; i < input.length(); i++){
            if (prev == input.charAt(i))
                cnt++;
            else {
                if (1 < cnt) {
                    System.out.print(cnt);
                    cnt = 1;
                }
                prev = input.charAt(i);
                System.out.print(prev);
            }
        }
        if(1 < cnt)
            System.out.print(cnt);
    }
    public static void solution(String input){
        int cnt = 1;
        String answer = "";

        input = input + " ";
        for (int i = 0; i < input.length() - 1; i++){
            if (input.charAt(i) == input.charAt(i + 1))
                cnt++;
            else {
                answer += input.charAt(i);
                if (1 < cnt) {
                    answer += String.valueOf(cnt);
                    cnt = 1;
                }
            }
        }
    }
}
