package space.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class StringToDesc {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] chars = s.toCharArray();
        Character[] revseordedChars = new Character[chars.length];
        for(int i = 0 ; i<chars.length;i++){
            revseordedChars[i] = chars[i];
        }
        Arrays.sort(revseordedChars,Collections.reverseOrder());
        for (Character alphabet : revseordedChars) {
            answer.append(alphabet);
        }
        return answer.toString();
//        char[] word = s.toCharArray();
//        char min=254;
//
//        for(int i=0;i<word.length - 1;i++){
//            min = word[i];
//            for(int j=i;j< word.length;j++){
//                if(min<word[j])
//                    min = word[j];
//            }
//            if(word[i]!=min)
//                swap(word[i],min);
//        }
//        for (char c : word) {
//            System.out.println(c);
//        }
//        answer = word.toString();
    }
    public static int strcmp(char a, char b){
        if(a > b)
            return 1;
        else if(a < b)
            return -1;
        else
            return 0;
    }
    public static void swap(char a, char b){
        char tmp;
        tmp = a;
        a = b;
        b = tmp;
    }
}
