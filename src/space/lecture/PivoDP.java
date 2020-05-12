package space.lecture;

public class PivoDP {
    public static void main(String[] args){
        System.out.println(dp(50));
        //2 n승 (밑으로 내려갈수록 2개씩 늘어남) n개의 층 but 2의 n승
        //50일경우 2^50


    }
    public static int dp(int x){
        if(x==1) return 1;
        if(x==2) return 1;
        return dp(x-1)+dp(x-2);
    }
}
