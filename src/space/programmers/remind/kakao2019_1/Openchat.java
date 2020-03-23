package space.programmers.remind.kakao2019_1;

import java.util.HashMap;


//한번 다시 풀어보기

public class Openchat {
    public static void main(String[] args) {
        String[] r = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        solution(r);
        for (String a : solution(r)) {
            System.out.println(a);
        }
    }
    public static String[] solution(String[] record){
        HashMap<String,String> nickName = new HashMap<String,String>();
        String[] answer;
        String[][] arr =  new String[record.length][3];
        int cnt=0;

        for(int i=0;i<record.length;i++){
            String[] temp;
            temp = record[i].split(" ");
            if(temp[0].equals("Enter")||temp[0].equals("Change")){
                nickName.put(temp[1],temp[2]);
            }

            if(temp[0].equals("Enter")||temp[0].equals("Exit")){
                arr[cnt][0]=temp[0];
                arr[cnt++][1]=temp[1];
            }
        }
        answer = new String[cnt];
        for(int i=0;i<cnt;i++){
            if(arr[i][0].equals("Enter")){
                answer[i]=nickName.get(arr[i][1])+"님이 들어왔습니다.";
            }
            if(arr[i][0].equals("Exit")){
                answer[i]=nickName.get(arr[i][1])+"님이 나갔습니다.";
            }
        }
        return answer;
    }
}
