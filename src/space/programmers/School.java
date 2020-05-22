/*

https://programmers.co.kr/learn/courses/30/lessons/42898

 */
package space.programmers;

public class School {
    public static void main(String[] args){
        solution(4,3,new int[][] {{2,2}});
    }
    //m 은 x
    //n 은 y
    public static int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        boolean[][] isPuddle = new boolean[n][m];
        int[][] dp = new int[m][n];

        for(int[] a : puddles){
            isPuddle[a[0]-1][a[1]-1]=true;
        }

        boolean flag = true;
        for(int i=0; i<m; i++){
            if(isPuddle[0][i]) flag = false;
            if(flag) dp[0][i]=1;
        }
        flag = true;
        for(int i=0;i<n;i++){
            if(isPuddle[i][0]) flag = false;
            if(flag) dp[i][0] = 1;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!isPuddle[i][j]){
                    dp[i][j] = (dp[i][j-1] + dp[i-1][j]) % 1000000007;
                }
            }
        }
        return dp[n-1][m-1];
    }
}
