package space.inflearn.java.section1;

import java.util.Scanner;

public class ReverseOnlyAlphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] chars = word.toCharArray();
        int lt = 0;
        int rt = chars.length - 1;
        while (lt < rt){
            if (!Character.isAlphabetic(chars[lt]))
                lt++;
            else if (!Character.isAlphabetic(chars[rt]))
                rt--;
            else{
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }
        System.out.println(chars);
    }
}
