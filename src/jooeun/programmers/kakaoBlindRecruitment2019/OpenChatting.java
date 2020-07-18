package jooeun.programmers.kakaoBlindRecruitment2019;

import java.util.HashMap;

public class OpenChatting {

    static final String enter = "Enter";
    static final String leave = "Leave";
    static final String change = "Change";

    static final String enter_word = "님이 들어왔습니다.";
    static final String leave_word = "님이 나갔습니다.";

    public static void main(String[] args){

        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = solution(record);

        for(String s : result){
            System.out.println(s);
        }

    }

    public static String[] solution(String[] record){

        HashMap<String, String> users = new HashMap<String, String>();

        for(String s : record){

            String[] temp  = s.split(" ");

            if(temp[0].equals(enter)){

            }else if(temp[0].equals(leave)){

            }else if(temp[0].equals(change)){

            }

        }

        String[] result = new String[]{};

        return result;

    }

}