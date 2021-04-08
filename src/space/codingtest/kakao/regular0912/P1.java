package space.codingtest.kakao.regular0912;

public class P1 {
    public static void main(String[] args) {
        System.out.println(solution("z-+.^"));

    }
    public static String solution(String new_id){
        String answer="";
        String regExp = "[^a-z0-9_.-]";

        //대문자를 소문자로
        answer=new_id.toLowerCase();
        //소문자,숫자,-,_,. 외 제거(정규식)
        answer=answer.replaceAll(regExp,"");
        // ..를 .로 치환
        answer = answer.replaceAll("[.]+", ".");
        // .가 처음이나끝에 위치하면 제거
        answer = answer.replaceAll("^[.]","");
        answer = answer.replaceAll("[.]$","");
        // 비었다면 a 대입
        if(answer.isEmpty()||answer.equals("")) answer = answer+"a";
        // 16자 이상이면 첫 15개를 제외한 나머지 문자들 모두 제거 제거 후 .이 끝이면문자제거
        if(answer.length()>=16){
            answer = answer.substring(0,15);
            answer = answer.replaceAll("[.]$","");
        }
        // 2지 이하면 마지막에 마지막 문자 대입
        if(answer.length()<=2){
            String lastString = answer.substring(answer.length() - 1);
            while(answer.length()<=2){
                answer += lastString;
            }
        };
        return answer;
    }
}
