package programmers.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test2 {
    public static void main(String[] args){
        int a = 7234;

        System.out.println(a / (int)Math.pow(10,((int)Math.log10(a))));

    }
    public static String solution(int[] numbers){
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int num : numbers){
            int firstNum = num / (int)Math.pow(10,(int)Math.log10(num));
           // map.put(firstNum,)
        }

        return "";
    }
}
