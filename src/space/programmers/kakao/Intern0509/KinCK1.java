package space.programmers.kakao.Intern0509;

public class KinCK1 {
    class Solution {
        int[][] dial = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2},{3,0},{3,2}};
        int currentLeft = 10;
        int currentRight = 11;

        public String solution(int[] numbers, String hand) {
            String answer = "";
            for(int i =0;i<numbers.length;i++){
                answer += answer(numbers[i], hand);
            }

            return answer;
        }
        public String answer(int num, String hand) {
            int left = Math.abs(dial[currentLeft][0] - dial[num][0]) + Math.abs(dial[currentLeft][1] - dial[num][1]);
            int right = Math.abs(dial[currentRight][0] - dial[num][0]) + Math.abs(dial[currentRight][1] - dial[num][1]);

            if (num == 2 || num == 5 || num == 8 || num == 0) {
                if (left == right) {
                    if (hand.equals("left")) {
                        currentLeft = num;
                        return "L";
                    } else {
                        currentRight = num;
                        return "R";
                    }
                }
                else if (left > right) {
                    currentRight = num;
                    return "R";
                }
                else {
                    currentLeft = num;
                    return "L";
                }
            }
            if(num == 1 || num==4 || num== 7){
                currentLeft =num;
                return "L";
            }
            else {
                currentRight = num;
                return "R";
            }
        }
    }

}
