package space.programmers.level1;

public class ReverseArray {
    public int[] solution(long n) {
        int[] answer;

        StringBuilder sb = new StringBuilder("" + n);
        sb.reverse();

        answer = new int[sb.length()];
        char[] chars = sb.toString().toCharArray();
        for (int i = 0; i < chars.length; ++i){
            answer[i] = chars[i] - '0';
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
