package jooeun.codingtest.codingtest_11st;

import java.util.*;

public class Solution1 {

//    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
//
//        Collection<Integer> answer = new ArrayList<Integer>();
//
//        int[] check = new int[10];
//        Iterator it = numbers.iterator();
//
//        while(it.hasNext()){
//            check[(int)it.next()]++;
//        }
//
//        for(int i = 0 ; i < check.length; i++){
//            if(check[i] == 1){
//                answer.add(i);
//            }
//        }
//
//        return answer;
//    }

    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers){

        Collection<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Iterator it;
        Integer num;

        for(int n : numbers){
            if(map.containsKey(n)){
                map.put(n, 1);
            }else{
                map.put(n, map.get(n) + 1);
            }
        }

//        it = numbers.iterator();
//        while(it.hasNext()){
//
//            num = (Integer)it.next();
//
//            if(map.get(num) == null){
//                map.put(num, 1);
//            }else{
//                map.put(num, map.get(num)+1);
//            }
//
//        }
//
        it = map.keySet().iterator();
        while(it.hasNext()){

            num = (Integer)it.next();

            if(map.get(num) == 1){
                answer.add(num);
            }

        }

    return answer;
    }


    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }

}
