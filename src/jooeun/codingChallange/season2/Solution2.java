package jooeun.codingChallange.season2;

public class Solution2 {

    static int[][]  arr = {{1,1,0,0,},{1,0,0,0},{1,0,0,1},{1,1,1,1}};

    public static void main(String[] args){

        int[] answer = solution(arr);

//        for(int i : answer){
//            System.out.print(i + "   ");
//        }
    }

    public static int[] solution(int[][] arr){

        int n = arr.length;
        int[] answer = new int[2];

        while(n > 0){

            n /= 2;



        }

        return answer;
    }

    static void dfs(){



    }

    static boolean check_Bound(int row, int col){

        if(-1 < row && row < arr.length && -1 < col && col < arr[0].length){
            return true;
        }else{
            return false;
        }

    }
}
