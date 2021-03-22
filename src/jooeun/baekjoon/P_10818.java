package jooeun.baekjoon;

public class P_10818 {

    public static void main(String[] args){
        int n = 5;
        int[] ary = {20, 10, 35, 30, 7};

        solution(n, ary);
    }

    public static void solution(int n , int[] ary){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i= 0 ; i < ary.length; i++){

            if(min > ary[i])
                min = ary[i];

            if(max < ary[i])
                max = ary[i];

        }

        System.out.println(min + " " + max);
    }

}
