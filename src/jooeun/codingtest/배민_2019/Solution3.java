package jooeun.codingtest.배민_2019;

public class Solution3 {

    public static void main(String[] args){

        String word = "I love you";
        // R olev blf
        System.out.println(solution(word));
    }

    public static String solution(String word){

        StringBuilder sb = new StringBuilder();
        for(char c : word.toCharArray()){

            if(('A' <= c && c <= 'M'))
                sb.append((char)('A' + 25 + 'A' - c));
            else if('N' <= c && c <= 'Z')
                sb.append((char)('Z' - 25 + 'Z' - c));
            else if('a' <= c && c <= 'm')
                sb.append((char)('a' + 25 + 'a' - c));
            else if('n' <= c && c <= 'z')
                sb.append((char)('z' - 25 + 'z' - c));
            else
                sb.append(c);
        }
        return sb.toString();
    }


}
