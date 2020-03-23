package programmers.remind.DFS;

public class DFS_1 {
    public static void main(String[] args){
        int[] arr = {1,1,1,1,1};
        int target = 3;

        System.out.println(new DFS_1().solution(arr, target));

        return ;
    }
    public int solution(int[] numbers, int target){
        return DFS(numbers, target,0,0);

    }
    public int DFS(int[] numbers, int target, int index, int sum){
        if(numbers.length==index)
            return target==sum?1:0;
        else{
            return DFS(numbers, target, index+1,sum+numbers[index])+DFS(numbers,target,index+1,sum-numbers[index]);
        }
    }
}
