package space.programmers.lv0;

public class FindNum {
    public static void main(String[] args) {
    }
    public int solution(int num, int k) {
        String str = Integer.toString(num);
        int answer;
        answer = str.indexOf(k + '0') + 1;
        if (answer == 0)
            return -1;
        return answer;
    }
}
