package space.programmers;

public class Level1P1 {
    public static void main(String[] args) {

    }
    public int solution(String s) {
        char[] arr = s.toCharArray();
        if(arr[0]=='+'||arr[0]=='-'){
            int answer = Integer.parseInt(s.substring(1,s.length()+1));
            if(arr[0]=='-') return answer*-1;
            return answer;
        }
        else{
            return Integer.parseInt(s);
        }
    }
}
