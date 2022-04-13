package space.inflearn.java.section1;
import java.util.Scanner;

public class ReverseTheWord2 {
    public static char[] reverseString(char[] word)
    {
        int lt = 0;
        int rt = word.length - 1;

        while (lt < rt)
        {
            char tmp = word[lt];
            word[lt] = word[rt];
            word[rt] = tmp;
            lt++;
            rt--;
        }
        return word;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i=0; i<n; i++){
            words[i] = sc.next();
            System.out.println(reverseString(words[i].toCharArray()));
        }
    }
}
