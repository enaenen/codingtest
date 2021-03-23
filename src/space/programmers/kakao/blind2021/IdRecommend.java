package space.programmers.kakao.blind2021;

public class IdRecommend {
    public static void main(String[] args) {
        System.out.println(solution("=.="));
    }
    public static String solution(String new_id) {
        StringBuilder as = new StringBuilder();
        String answer = new_id.toLowerCase();

        char[] chars = answer.toCharArray();
        int length = chars.length;
        int i = 0;
        if(chars[0]=='.')
            chars[0]=' ';
        if(chars[chars.length-1]=='.')
            chars[length-1]=' ';

        while(i<length){
            if(('a'<=chars[i] && chars[i] <='z')||('A'<=chars[i] && chars[i]<='Z')||chars[i]=='-'||chars[i]=='_'||chars[i]=='.')
                as.append(chars[i]);
            i++;
        }
        answer = as.toString();
        while(answer.contains("..")) {
            answer = answer.replace("..", ".");
        }
        if(answer.length()>0){
            if(answer.charAt(0)=='.'){
                answer=answer.substring(1,answer.length()-1);
            }
        }
        if(answer.length()>0){
            if(answer.charAt(answer.length()-1)=='.'){
                answer=answer.substring(0,answer.length()-1);
            }
        }
        if(answer.equals(""))
            answer="a";

        if(answer.length()>=16){
            answer=answer.substring(0,15);
            if(answer.charAt(answer.length()-1)=='.')
                answer=answer.substring(0, answer.length()-1);
        }

        StringBuilder sbLast = new StringBuilder(answer);
        if(sbLast.length()<=2) {
            char last = sbLast.charAt(sbLast.length() - 1);
            while(sbLast.length() < 3)
                sbLast.append(last);
        }
        answer = sbLast.toString();
        return answer;
    }
}
