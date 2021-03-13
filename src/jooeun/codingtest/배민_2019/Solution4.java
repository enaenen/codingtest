package jooeun.codingtest.배민_2019;

public class Solution4 {

    static int cnt;

    public static void main(String[] args){

//        int[] pobi = {97, 98};
//        int[] crong = {197, 198};

//        int[] pobi = {131, 132};
//        int[] crong = {211, 212};

        int[] pobi = {99, 102};
        int[] crong = {211, 212};
        cnt = pobi.length;

        // 1 : 포비가 이김
        // 2 : 크롱이 이김
        // 0 : 무승부
        // -1 : 예외사항
        switch(solution(pobi, crong)){
            case(0) :
                System.out.println("0 -> 무승부"); break;
            case(1) :
                System.out.println("1 -> 포비가 이김");break;
            case(2) :
                System.out.println("2 -> 크롱이 이김"); break;
            default :
                System.out.println("-1 -> 예외사항"); break;
        }
    }

    public static int solution(int[] pobi, int[] crong){

        if(is_continues(pobi) && is_continues(crong)){

            int[] max_score = {Integer.MIN_VALUE, Integer.MIN_VALUE};
            int[] calc_res = new int[2];

            for(int i = 0 ; i <cnt; i++){

                calc_res[0] = calc_maximum(pobi[i]);
                calc_res[1] = calc_maximum(crong[i]);

                if(max_score[0] < calc_res[0])
                    max_score[0] = calc_res[0];

                if(max_score[1] < calc_res[1])
                    max_score[1] = calc_res[1];
            }

            if(max_score[0] > max_score[1])
                return 1;
            else if(max_score[0] == max_score[1])
                return 0;
            else
                return 2;
        }
        return -1;
    }

    public static int calc_maximum(int num){

        int res_plus = 0;
        int res_mul = 1;
        int n = 0;

        // 더하기
        while(num > 0){

            n = num%10;

            res_plus += n;
            res_mul *= n;

            num = num/10;
        }

        return Math.max(res_mul, res_plus);
    }

    public static boolean is_continues(int[] ary){

        if(ary[1] - ary[0] == 1)
            return true;
        else
            return false;
    }
}
