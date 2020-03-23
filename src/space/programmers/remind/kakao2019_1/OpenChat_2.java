//package space.programmers.remind.kakao2019_1;
//
//import java.util.HashMap;
//
//public class OpenChat_2 {
//    public static void main(String[] args) {
//        String[] r = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
//        solution(r);
//        for (String a : solution(r)) {
//            System.out.println(a);
//        }
//    }
//    public static String[] solution(String[] record) {
//        //입력 -> [입퇴장과변경여부, 아이디, 닉네임]
//        //입력받은것을 2차원배열로 나누어서 임시로 담아두어야 분류할 수 있다.
//        //출력 -> [닉네임 + 입퇴장문구]
//
//        //닉네임만 따로 hashmap 으로 저장하여 업데이트
//        //입장과 닉변 일때 닉네임 변경
//
//        //answer에는 들어갈때와 나갈때만 필요
//        HashMap<String, String> map = new HashMap<String,String>();
//       // String[][] tmp = new String[record.length][3];
//        String[] tmp;
//        String[][] tmp2 = new String[record.length][3];
//
//        for(int i=0;i<record.length;i++){
//            tmp = record[i].split(" ");
//            if(tmp[0].equals("Enter")||tmp[0].equals("Change")){
//                map.put(tmp[1],tmp[2]);
//            }
//            if(tmp[0].equals("Enter")||tmp[0].equals("Exit")){
//                tmp2[i][0]=
//            }
//        }
//
//       // return answer;
//    }
//}
