package space.inflearn.java.section2.review;

import java.util.Scanner;

public class ReverseNumAndCheckPrime {
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n ; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int reversedNum = 0;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            reversedNum = 0;
            while (0 < i) {
                int tmp = i % 10;
                reversedNum = reversedNum * 10 + tmp;
                i /= 10;
            }
//            System.out.println(reversedNum);
            if (isPrime(reversedNum))
                System.out.print(reversedNum + " ");
        }
    }
}
