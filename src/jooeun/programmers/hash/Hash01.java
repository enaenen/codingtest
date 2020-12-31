package jooeun.programmers.hash;


import java.util.ArrayList;
import java.util.Arrays;

public class Hash01 {

    public static void main(String[] args){


        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String answer = solution(participant, completion);

        System.out.println(answer);

    }

    static public String solution(String[] participant, String[] completion) {

        String answer = "";

        //오름차순으로 정렬

        Arrays.sort(participant);
        Arrays.sort(completion);

        //for 문을 돌며 같은지 확인
        //x : break;

        boolean flag = false;

        for(int i = 0 ; i < completion.length; i++){

            if(!participant[i].equals(completion[i])){
                flag = false;

                answer = participant[i];
                break;
            }else{

                if(!flag)
                    flag = true;

            }

        }

        if(flag)
            answer = participant[participant.length - 1];

        return answer;
    }

// 효율성 0%

//    static public String solution(String[] participant, String[] completion) {
//
//        String answer;
//
//        //참가자 ArrayList 만들기
//        ArrayList<String> p_list = new ArrayList<String>();
//
//        for(String s : participant)
//            p_list.add(s);
//
//        //처음부터 돌면서 이름 같을 경우 ArrayList 에서 이름 지우기
//        for(String c_name : completion){
//
//            for(int i = 0 ; i < p_list.size(); i++){
//
//                if(c_name.equals(p_list.get(i))){
//                    p_list.remove(i);
//                    break;
//                }
//
//            }
//
//        }
//
//        //마지막 남은 이름 리턴
//        answer = p_list.get(0);
//
//        return answer;
//    }
}

