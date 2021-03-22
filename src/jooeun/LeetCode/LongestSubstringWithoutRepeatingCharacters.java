package jooeun.LeetCode;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    static public void main(String[] args){

        String s = "bbbb";

        System.out.println(solution(s));

    }

//    static public int solution(String s){
//
//        int max = 0;
//        Set<Character> set = new HashSet<Character>();
//
//        for(int i = 0 ; i < s.length(); i++){
//
//            set.add(s.charAt(i));
//
//            for(int j = i+ 1; j < s.length(); j++){
//
//                if(set.contains(s.charAt(j)))   break;
//                else    set.add(s.charAt(j));
//            }
//
//            if(max < set.size())
//                max = set.size();
//
//            set.clear();
//        }
//
//        return max;
//    }

    static public int solution(String s){

        int max = 0;
        int cnt;
        int[] ary = new int[129];

        for(int i = 0 ; i < s.length(); i++){

            ary[s.charAt(i)] = 1;
            cnt = 1;

            for(int j = i + 1 ; j < s.length(); j++){

                if(ary[s.charAt(j)] == 0){

                    cnt++;
                    ary[s.charAt(j)] = 1;

                }else break;

            }

            if(max < cnt){
                max = cnt;
            }

            Arrays.fill(ary, 0);
        }

        return max;
    }

}
