package jooeun.codingtest.스타트업코딩페스티벌2021;

public class Solution2 {

    static int answer = 0;

    public static void main(String[] args){

//        test case 1
//        int n = 3;
//        String s = "111";
//      answer -> 2

//        test case 2
//        int n = 4;
//        String s = "1101";
//      answer -> 1

//        test case 3
        int n = 5;
        String s = "11111";
//      answer -> 5

        solution(n, s);
        System.out.println(answer);
    }

    public static void solution(int n, String s){

        int[] ary = new int[n];
        for(int i = 0 ; i < n; i++)
            ary[i] = s.charAt(i) - '0';

        dfs(ary, 0, n);
    }

    public static void dfs(int[] ary, int idx, int n){

        if(idx == n - 1) {
            answer++;
            return ;
        }else if(idx >= n)
            return ;

        if(idx + 1 < n && ary[idx + 1] == 1)
            dfs(ary, idx + 1, n);

        if(idx + 2 < n && ary[idx + 2] == 1)
            dfs(ary, idx + 2, n);
    }
}
