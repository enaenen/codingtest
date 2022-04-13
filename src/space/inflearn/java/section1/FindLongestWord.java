package space.inflearn.java.section1;

import java.util.Scanner;

public class FindLongestWord {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] words = in.nextLine().split(" ");
        String answer = "";
        for (String s : words) {
            if (answer.length() < s.length())
                answer = s;
        }
        System.out.println(answer);
    }
}
