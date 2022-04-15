package space.inflearn.java.section2.array;

import java.util.Scanner;

public class Pibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        System.out.print(arr[0] + " " + arr[1] + " ");
        for (int i = 2; i < n; i++){
            arr[i] = arr[i -1] + arr[i - 2];
            System.out.print(arr[i] + " ");
        }
    }
    public static void solution(int n){
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n ;i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
