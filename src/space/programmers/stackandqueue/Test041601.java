package space.programmers.stackandqueue;

public class Test041601 {
    public static void main(String[] args){

        int[] answer = new Test041601().solution(new int[][] {{1,4},{3,4},{3,10}});
        System.out.println("["+answer[0]+","+answer[1]+"]");
    }

    public int[] solution(int[][] v){

        int x,y;

        if(v[0][0]==v[1][0]){
            x=v[2][0];
        }else if(v[0][0]==v[2][0]){
            x=v[1][0];
        }else{
            x=v[0][0];
        }

        if(v[0][1]==v[1][1]){
            y=v[2][1];
        }else if(v[0][1]==v[2][1]){
            y=v[1][1];
        }else{
            y=v[0][1];
        }
        int[] answer = {x,y};
        return answer;
    }
}
