/*
작성자 : 채우주
복습중..
 */
package programmers.remind.hashmap;

import java.util.HashMap;
import java.util.Map;

public class LevelOne {
    public static void main(String[] args){
        String[] participant = {"mislav","stanko","mislav","ana"};
        String[] completion = {"stanko","ana","mislav"};
        System.out.println(solution(participant,completion));

    }
    public static String solution(String[] participant, String[] completion){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String p : participant){
            map.put(p,map.getOrDefault(p,0)+1);
        }
        for(String c : completion){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()>0){
                return entry.getKey();
            }
        }
        return "All PASS";
    }
}
