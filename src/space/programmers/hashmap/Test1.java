//작성자 : 채우주;
//작성일자 : 2019-11-
//완주하지 못한 선수 문제
//
package space.programmers.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args){
        String[] participant = {"mislav","stanko","mislav","ana"};
        String[] completion = {"stanko","ana","mislav"};
        String answer="";

        HashMap<String,Integer> hm = new HashMap<String,Integer>();

       for(String p : participant){
           //participant의 이름(키)이 중복될경우 뒤에 +1을 통해서 2가 된다
           hm.put(p,hm.getOrDefault(p,0)+1);
       }

       for(String c : completion){
           //완주자의 경우 기존값 -1 이므로 1-1 이되고 동명이인 중 한명만 골인하는 조건으로 인해
           //둘 중 한명은 무조건 1 이상이된다.
           hm.put(c,hm.getOrDefault(c,1)-1);
       }

       for(Map.Entry<String,Integer> entry : hm.entrySet()){
           //entry<키,밸류> 를 가져와서 밸류에 0보다 크면 걸러낸다
           //완주자는 위의 수식을 통해 0으로 밸류값이 바뀌어있다.
           if(entry.getValue()>0){
                answer = entry.getKey();
                System.out.println(answer);
                break;
           }
           //프로그래머스에서는 return answer를 하기때문에 틀림이 출력되지 않음
           else{
               System.out.println("틀림");
           }
       }

    }

}
