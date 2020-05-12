package space.lecture;

public class PivoDP1 {
    private static long[] memo = new long[100];

    public static void main(String[] args){
        System.out.println(dp(30));
    }
    public static long dp(int x){
        if(x==1) return 1;
        if(x==2) return 1;
        if(memo[x]!=0) return memo[x];
        return memo[x]=(dp(x-1)+dp(x-2));
    }
}
