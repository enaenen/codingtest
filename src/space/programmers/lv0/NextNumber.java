package space.programmers.lv0;

public class NextNumber {
    public static int solution(int[] common) {
        int answer = 0;
        int prev = common[1] - common[0];
        int diff = 0;

        for(int i = 1; i < common.length - 1; i++){
            diff = common[i + 1] - common[i];
            if (diff != prev) {
                answer = common[common.length - 1] * (common[i+1] / common[i]);
                return answer;
            }
        }
        answer = common[common.length - 1] + diff;
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4}));
        System.out.println(solution(new int[] {2,4,8}));
    }
}
