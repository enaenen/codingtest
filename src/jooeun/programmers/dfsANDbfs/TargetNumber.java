package jooeun.programmers.dfsANDbfs;

public class TargetNumber {

    static int result;
    static int[] ary;

    public static void main(String[] args){

        int [] numbers= new int[]{1, 1, 1, 1, 1};
        int target = 3;

        solution(numbers,target);

        System.out.println("RESULT : " + result);

    }

    static public int solution(int[] numbers, int target) {

        ary = numbers;
        dfs(0,0,target);

        return result;
    }

    //numbers 사용 여부 체크, 정답 개수, 길이
     static void dfs(int sum, int k, int target){

        if(k == ary.length){

            if(sum == target){
                result++;
            }
            return;

        }

        dfs(sum + ary[k],k+1,target);
        dfs(sum - ary[k],k+1,target);

    }


}
