package jooeun.codingChallange.season1;

import java.util.*;

public class Solution1 {

    static public void main(String[] args){


        int[] numbers = {2,1,3,4,1};
        int[] answer = solution(numbers);

        for(int i : answer){
            System.out.print(i + "   ");
        }

    }

    static public int[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0 ; i < numbers.length; i++){
            for(int j = i+1 ; j < numbers.length; j++){

                list.add(numbers[i] + numbers[j]);

            }
        }


        Collections.sort(list);

        System.out.println(list);

        int front = -100;
        int now = 0;
        int idx = 0;

        while(list.size() > idx){

            now = list.get(idx);

            if(now == front){

                list.remove(idx);

            }else{

                idx++;
            }

            front = now;

        }

        int [] answer = new int[list.size()];

        for(int i = 0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;

//        HashMap<Integer, ArrayList<Number2>>  sumList = new HashMap<Integer, ArrayList<Number2>>();
//
//        int sum = 0;
//        ArrayList<Number2> list = null;
//
//        for(int i = 0 ; i < numbers.length; i++){
//            for(int j = i+1; j < numbers.length; j++){
//
//                sum  = numbers[i] + numbers[j];
//
//                System.out.println(sum + " = " +numbers[i] + " + " + numbers[j]);
//                if(sumList.get(sum) == null){
//
//                    list = new ArrayList<Number2>();
//
//                }else{
//
//                    list = sumList.get(sum);
//
//                }
//
//                list.add(new Number2(numbers[i],numbers[j]));
//                sumList.put(sum,list);
//            }
//        }
//
//        Object[] array = sumList.keySet().toArray();
//        int[] answer = new int[array.length];
//
//        for(int i= 0 ; i < array.length ; i++){
//
//            answer[i] = (int)array[i];
//
//        }
//
//        return answer;
    }

}

//class Number2{
//    int num1;
//    int num2;
//
//    public Number2(){}
//
//    public Number2(int num1, int num2){
//        this.num1 = num1;
//        this.num2 = num2;
//    }
//}
