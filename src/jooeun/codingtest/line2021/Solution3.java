package jooeun.codingtest.line2021;

public class Solution3 {

    public static void main(String[] args){
//        int[] enter = {1,3,2};
//        int[] leave = {1,2,3};
        int[] enter = {1,4,2,3};
        int[] leave = {2,1,4,3};

        int[] answer = solution(enter, leave);
        for(int i : answer)
            System.out.print(i + "  ");
    }

    public static int[] solution(int[] enter, int[] leave){

        int[][] enter_leave = new int[2][enter.length + 1];

        for(int i = 1 ; i <= enter.length; i++){

            for(int j = 0 ; j < enter.length; j++){

                if(i == enter[j]) {
                    enter_leave[0][i] = j;
                    break;
                }
            }

            for(int j = 0 ; j < leave.length; j++){

                if(i  == leave[j]) {
                    enter_leave[1][i] = j;
                    break;
                }
            }
        }

        int enter_num ;
        int leave_num;

        int[] answer = new int[enter.length];
        int leave_idx = 0;

        while(leave_idx < leave.length){

            for(int i = 0 ; i < enter.length; i++){



            }

            leave_idx++;
        }

        return answer;
    }

}
