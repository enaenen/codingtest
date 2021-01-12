package jooeun.programmers.codechallange1;

//  https://programmers.co.kr/learn/courses/30/lessons/68644

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution1 {

    public static void main(String[] args){

        int[] numbers = {2,1,3,4,1};
        int[] answer = solution(numbers);

        for (int i : answer){
            System.out.print(i +"   ");
        }

    }

    public static int[] solution(int[] numbers) {

        HashSet<Integer> sum = new HashSet<Integer>();

        for(int i = 0 ; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                sum.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sum.size()];

        Iterator<Integer> itr = sum.iterator();
        int i = 0;

        while(itr.hasNext()){
            answer[i++] = itr.next();
        }

        Arrays.sort(answer);

        return answer;
    }

}
