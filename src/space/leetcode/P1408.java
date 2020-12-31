package space.leetcode;
/*
https://leetcode.com/problems/string-matching-in-an-array/
2020-10-19
 */
import java.util.*;

public class P1408 {
    public static void main(String[] args) {
        for(String a : stringMatching(new String[] {"leetcoder","leetcode","od","hamlet","am"})){
            System.out.println(a);
        }
    }

    public static List<String> stringMatching(String[] words) {
        Set answer = new HashSet();
        for(int i=0; i<words.length;i++){
            String target = words[i];
            for(int j=0;j<words.length;j++){
                if(i==j) continue;
                if(words[j].indexOf(target)!=-1) answer.add(words[i]);
            }
        }
        return new ArrayList<String>(answer);
    }
}
