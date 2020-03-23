package space.programmers.sort;

import java.util.*;

public class Test2 {
    public static void main(String[] args){
        int[] t1 = {6,10,2};
        int[] t2 = {3,30,34,5,9};
//        System.out.println(331 / (int)Math.pow(10,(int)Math.log10(331)));
        System.out.println(solution(t1));
    }
    public static String solution(int[] numbers){
        String[] list = new String[numbers.length];
        for(int i=0;i<list.length;i++){
            list[i]=Integer.toString(numbers[i]);
        }
        Arrays.sort(list,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        if(list[0].equals("0"))
            return "0";

        String answer="";
        for(String a : list){
            answer+=a;
        }
        return answer;
    }
}
