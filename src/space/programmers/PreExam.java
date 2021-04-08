package space.programmers;

public class PreExam {
    public static void main(String[] args) {
        solution(new int[] {1,2,3,4,5});
    }
    public static int[] solution(int[] answers) {
        int one[] = {5,1,2,3,4};
        int two[] = {5,2,1,2,3,2,4,2};
        int three[] = {5,3,3,1,1,2,2,4,4,5};
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int[] answer = {};
        for(int i=1;i<=answers.length;i++){
            if(answers[i-1]==one[i%one.length])
                oneCount++;
        }
        for(int i=1;i<=answers.length;i++){
            if(answers[i-1]==two[i%two.length])
                twoCount++;
        }
        for(int i=1;i<=answers.length;i++){
            if(answers[i-1]==three[i%three.length])
                threeCount++;
        }
        return answer;
    }
}
