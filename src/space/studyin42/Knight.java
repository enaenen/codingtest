package space.studyin42;

import java.util.Scanner;

public class Knight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] inputs = sc.next().toCharArray();
        int[][] set = {{-2, 1}, {-2, -1}, {2, 1}, {2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};
        int x, y;
        int cnt = 0;
        
        x = inputs[0] - 'a' + 1;
        y = Integer.parseInt(String.valueOf(inputs[1]));
        
        for (int[] ints : set) {
            int tmpX = x + ints[0];
            int tmpY = y + ints[1];
            if (1 <= tmpX && tmpX <= 8 && 1 <= tmpY && tmpY <= 8) {
                cnt++;
//                System.out.println("ints[0] = " +ints[0] + " ints[1]= " +ints[1]);
//                System.out.println("tmpX = "+tmpX + " tmpY = " + tmpY);
            }
        }
        System.out.println(cnt);
    }
}
