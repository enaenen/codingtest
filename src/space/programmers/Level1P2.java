package space.programmers;

public class Level1P2 {
    public static void main(String[] args) {

    }
    public boolean solution(int x) {
        boolean answer = false;
        String strNumArr =String.valueOf(x);
        char[] charNumArr = strNumArr.toCharArray();
        int num=0;
        for(int i =0;i<charNumArr.length;i++){
            num+=charNumArr[i]-'0';
        }
        if(x%num==0) answer=true;

        return answer;
    }
}
