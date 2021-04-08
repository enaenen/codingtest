package space.codingtest.intern0523;

public class P1 {
    private static int answer;
    private static boolean flag;
    public static void main(String[] args){
        System.out.println(solution(1987));
        System.out.println(answer);

    }
    public static int solution(int p) {
        dfs(p);
        return answer;
    }
    public static void dfs(int num){
        num++;
        char[] nums = Integer.toString(num).toCharArray();
        int[] check = new int[10];

        for(int i=0;i<nums.length;i++) {
            if(flag){
                return;
            }
            if (check[Integer.parseInt(String.valueOf(nums[i]))] >= 1)
                dfs(num++);
            else {
                check[Integer.parseInt(String.valueOf(nums[i]))]++;
                if(i==nums.length-1) {
                    flag=true;
                    answer=num;
                }
            }
        }
    }

}
