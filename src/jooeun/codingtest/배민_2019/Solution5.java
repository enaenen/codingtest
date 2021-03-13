package jooeun.codingtest.배민_2019;

public class Solution5 {

    public static void main(String[] args){

//        int number = 13;    // res = 4;
        int number = 33;    // res = 14;

        System.out.println(solution(number));
    }

    public static int solution(int number){

        if(number < 3)
            return 0;

        int answer = 0;
        int n = 0;
        int calc_res = 0;

        for(int i = 1; i <= number; i++){

            n = i;
            while(n > 0){

                calc_res = n%10;

                if(calc_res == 3 || calc_res == 6 || calc_res == 9)
                    answer++;

                n /= 10;
            }
        }
        return answer;
    }
}
