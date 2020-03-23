package space.programmers.sort;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args){
        int[] t1 = {350,452,877};
        int[] t2 = {3,30,34,5,9};
//        System.out.println(331 / (int)Math.pow(10,(int)Math.log10(331)));
        System.out.println(solution(t1));
    }
    public static int solution(int[] citations){
        int answer=0;
        int tmp;
        int remain;
        int total = citations.length;

        Arrays.sort(citations);
        for(int i : citations) {
            System.out.println(i);
        }

        for(int i=0;i<total;i++){
            tmp = citations[i];
            remain = total-i;
            if(remain<=tmp){
                answer = tmp;
                break;
            }
        }
        return answer;
    }
}
