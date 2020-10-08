package jooeun.codingChallange.season1;

public class Solution4 {

    static int[] cnt_1;
    static int i_max;
    static int j_max;
    static int answer;

    static public void main(String[] args){


        int[][] a = {{0,1,0},{1,1,1},{1,1,0},{0,1,1}};

        System.out.println(solution(a));

    }

    static public int solution(int[][] a) {

        //각 열마다 1의 개수
        cnt_1 = new int[a[0].length];

        i_max = a.length;
        j_max = a[0].length;

        for(int i = 0; i < a[0].length ; i++){
            for(int j = 0 ; j < a.length; j++){

                if(a[j][i] == 1){
                    cnt_1[i]+=1;
                }
            }
        }

        int[][] b = new int[a.length][a[0].length];

        dfs(0,0,b);


        return (answer%10000019);
    }

    static public void dfs(int i, int j,int[][] b){

        System.out.println("DFS");

        if(i == i_max || j == j_max){
            answer++;
            return;
        }

        //1로
        int cnt = 0;
        for(int ii = 0; ii < b.length ; ii++){
            System.out.println(ii + "   " + j);
            if(b[ii][j] == 1){
                cnt++;
            }
        }

        if(cnt_1[j] > cnt){

            b[i][j] = 1;

            if(i == b.length){

                dfs(0,j+1,b);

            }else{
                dfs(i+1 ,j +1 ,b);
            }


            b[i][j] = 0;
            if(i == b.length){

                dfs(0,j+1,b);

            }else{
                dfs(i+1 ,j +1 ,b);
            }

        }else{

            b[i][j] = 0;
            if(i == b.length){

                dfs(0,j+1,b);

            }else{
                dfs(i+1 ,j +1 ,b);
            }

        }


    }

}
