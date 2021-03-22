package jooeun.LeetCode;

public class ReverseInteger {

    public static void main(String[] args){

        int x = 1534236469;
        System.out.println(solution(x));
    }

    public static int solution(int x){

        StringBuilder sb;

        if(0 == x)
            return x;

        try{
            if(0 < x){
                sb = new StringBuilder(x+ "");
                return Integer.parseInt(sb.reverse().toString());
            }else{
                sb = new StringBuilder(Math.abs(x)+ "");
                return -Integer.parseInt(sb.reverse().toString());
            }
        }catch (Exception e){
            return 0;
        }
    }

}
