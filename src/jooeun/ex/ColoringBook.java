package jooeun.ex;

import com.sun.media.jfxmediaimpl.HostUtils;

public class ColoringBook {

    public static void main(String[] args){

        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0},{1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

        for(int i = 0 ; i < picture.length; i++){
            for(int j = 0 ; j < picture[i].length ; j++){
                System.out.print(picture[i][j]);
            }
            System.out.println();
        }

        int [] answer = solution(m,n,picture);

        System.out.println(answer[0] + "   " + answer[1]);
    }

    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;




        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}
