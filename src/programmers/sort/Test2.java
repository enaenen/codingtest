package programmers.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test2 {
    public static void main(String[] args){
        int[] t1 = {6,10,2};
        int[] t2 = {3,30,34,5,9};
    }
    public static String solution(int[] numbers){
        HashMap<Integer, List<Integer>> hm = new HashMap<Integer,List<Integer>>();
        //List<Integer> calc = new ArrayList<Integer>();
        int[] index = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
           // String calc = Integer.toString(numbers[i]).substring(0,1);

            int numberLength=((int)Math.log10(numbers[i]));
            index[i]=numbers[i] % ((int)Math.pow(10,numberLength));
        }
        Arrays.sort(numbers);


        return "";
    }
}
