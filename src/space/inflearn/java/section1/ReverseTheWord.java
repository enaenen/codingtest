package space.inflearn.java.section1;
import java.util.Scanner;

public class ReverseTheWord {
    public static char[] reverseString(char[] word)
    {
        char [] ret = new char[word.length];
        int j = word.length - 1;

        for (int i = 0; i < word.length; i++){
            ret[i] = word[j];
            j--;
        }
        return ret;
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
