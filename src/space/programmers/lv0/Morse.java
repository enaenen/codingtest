package space.programmers.lv0;

import java.util.Arrays;

public class Morse {
    public static String solution(String letter) {
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder answer = new StringBuilder();
        String[] originalMorse = letter.split(" ");
        for (String oneMorse : originalMorse) {
            for (int i = 0; i < morse.length; ++i) {
                if (oneMorse.equals(morse[i]))
                    answer.append((char)('a' + i));
            }
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
    }
}
