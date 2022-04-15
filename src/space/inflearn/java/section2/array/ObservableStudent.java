package space.inflearn.java.section2.array;

import java.util.Scanner;

public class ObservableStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int top = -1;
        int count = 0;

        for (int i=0; i < n; i++){
            int current = sc.nextInt();
            if (top < current) {
                count++;
                top = current;
            }
        }
        System.out.print(count);
    }
}
