/*
2019-11-08
2019 KAKAO BLIND RECRUITMENT
DEMO
 */
package space.programmers.kakao;

import java.util.HashMap;

public class DemoTest {
    public static void main(String[] args){
        String[] r = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        solution(r);
        for(String a : solution(r)){
            System.out.println(a);
        }
    }
    public static String[] solution(String[] record){
        int cnt=0;
        HashMap<String, String> map = new HashMap<String, String>();
        String[][] arr = new String[record.length][2];

        for(int i=0;i<record.length;i++){
            String[] temp;
            temp = record[i].split(" ");

            if(temp[0].equals("Enter")||temp[0].equals("Change")){
                map.put(temp[1],temp[2]);
            }
            if(temp[0].equals("Enter")||temp[0].equals("Leave")) {
                arr[cnt][0] = temp[0];
                arr[cnt++][1] = temp[1];
            }
        }
        String[] answer = new String[cnt];
        for(int i=0;i<cnt;i++){
            if(arr[i][0].equals("Enter")){
                answer[i]=map.get(arr[i][1])+"님이 들어왔습니다.";
            }
            else{
                answer[i]=map.get(arr[i][1])+"님이 나갔습니다.";
            }
        }
        return answer;
    }
}
