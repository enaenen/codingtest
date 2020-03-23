package space.programmers.stackandqueue;

public class Top {
    public static void main(String[] args){
        for(int i : solution(new int[] {6,9,5,7,4})){
            System.out.println(i);
        }
        System.out.println("------");
        for(int i : solution(new int[] {3,9,9,3,5,7,2})){
            System.out.println(i);
        }
        System.out.println("------");
        for(int i : solution(new int[] {1,5,3,6,7,6,5})){
            System.out.println(i);
        }

    }
    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            for(int j=i;j>=0;j--){
                if(heights[i]<heights[j]){
                    answer[i]=j+1;
                    break;
                }
                else{
                    answer[i]=0;
                }
            }
        }
        return answer;
    }
}
