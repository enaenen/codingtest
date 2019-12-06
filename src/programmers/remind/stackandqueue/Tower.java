package programmers.remind.stackandqueue;

public class Tower {
    public static void main(String[] args){
        int[] h1 = {6,9,5,7,4};
        int[] h2 = {3,9,9,3,5,7,2};
        int[] h3 = {1,5,3,6,7,6,5};
        for(int a : solution(h1)){
            System.out.println(a);
        }
        for(int a : solution(h2)){
            System.out.println(a);
        }
        for(int a : solution(h3)){
            System.out.println(a);
        }

    }
    public static int[] solution(int[] heights){
        int[] answer = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            for(int j=i; j>0;j--){
                if(heights[i]<heights[j]){
                    answer[i]=j+1;
                    break;
                }
            }
        }
        return answer;
    }
}
