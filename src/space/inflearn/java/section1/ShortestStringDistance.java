package space.inflearn.java.section1;

import java.util.Scanner;

public class ShortestStringDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        String word = input[0];
        char target = input[1].charAt(0);
        solution(word, target);
        int[] answer = new int[word.length()];

        int distance = 1000;
        for (int i = 0; i < word.length(); i++){
            if (target == word.charAt(i)) {
                distance = 0;
                answer[i] = distance;
            }
            else
                answer[i] = ++distance;
        }
        distance = 1000;
        for (int i = word.length() - 1; 0 <= i; i--){
            if (target == word.charAt(i)){
                distance = 0;
                answer[i] = distance;
            }
            else if (++distance <= answer[i])
                answer[i] = distance;
        }
        for (int i : answer) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
    public static void solution(String str, char target){
        int[] answer = new int[str.length()];
        int distance = 1000;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == target)
            {
                distance = 0;
                answer[i] = distance;
            }
            else
                answer[i] = ++distance;
        }

        for (int i = str.length() - 1; 0 <= i; i--){
            if (str.charAt(i) == target)
            {
                distance = 0;
                answer[i] = 0;
            }
            else if (++distance < answer[i])
                answer[i] = distance;
        }
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println("end");
    }
}
