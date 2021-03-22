package jooeun.codingtest.kakaoBlind2021;

import java.util.ArrayList;

public class Kakao1 {

    public static void main(String[] args){

        String new_id = "z-+.^.";

        String answer = solution(new_id);

        System.out.println(answer);

    }

    public static String solution(String new_id){

        //1. 대문자 -> 소문자
        String edit = new_id.toLowerCase();

        ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 0 ; i < edit.length() ; i++){
            list.add(edit.charAt(i));
        }

        //2. -, _, . 제외한 문자 제거
        int idx = 0;
        char now = ' ';

        while(idx != list.size()){

            now = list.get(idx);

            //소문자, 숫자 거르기
            if('0' <= now && now <= '9'){
                idx++;
                continue;
            }else if('a' <= now && now <= 'z'){
                idx++;
                continue;
            } else if(now == '-' || now == '_' || now == '.'){
                idx++;
                continue;
            }else{
                list.remove(idx);
            }

        }

        //3. ... , .. -> . 바꾸기
        char[] char_info = {'-', '-'};
        idx = 0;
        while(idx != list.size()){

            now = list.get(idx);

            //'...' -> '.'
            if(char_info[0] == '.' && char_info[1] == '.' && now == '.'){

                list.remove(idx-1);
                list.remove(idx-1);

            }else if(char_info[1] == '.' && now == '.'){

                list.remove(idx-1);

            } else{

                char_info[0] = char_info[1];
                char_info[1] = now;

                idx++;

            }
        }

        //4. '.' 처음 끝 제거
        if(list.get(0) == '.'){
            list.remove(0);
        }

        //5. 빈 문자열이라면 'a'를 추가
        if(list.size() == 0){

            list.add('a');

        }

        //6. 길이가 16자 이상이라면, 15개 이후부터 모두 제거하기
        if(list.size() >= 15){

            while(list.size() != 15){
                list.remove(15);
            }

        }

        if(list.get(list.size() -1 ) == '.'){
            list.remove(list.size() -1);
        }

        //7. 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 계속 끝에 붙인다
        if(list.size() <= 2){

            now = list.get(list.size() - 1);

            while(list.size() != 3){

               list.add(now);

            }
        }

        StringBuffer sb = new StringBuffer("");
        for(int i = 0 ; i < list.size() ; i++){
            sb.append(list.get(i));
        }

        String answer = sb.toString();


        return answer;
    }

}
