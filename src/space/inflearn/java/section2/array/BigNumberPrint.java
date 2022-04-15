package space.inflearn.java.section2.array;

import java.util.Scanner;

public class BigNumberPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt + 1];
        arr[0] = -1;
        for (int i = 1; i <= cnt; i++) {
            arr[i] = sc.nextInt();
            if (arr[i-1] < arr[i]) {
                System.out.print(arr[i]);
                if (i != cnt)
                    System.out.print(" ");
            }
        }
    }
}
