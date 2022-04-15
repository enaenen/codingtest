package space.inflearn.java.section2.array;

import space.codingtest.kakao.Intern0509.KIntern1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseNumAndCheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        solution(n);

        String[] input = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder(input[i]);
                    arr[i] = Integer.parseInt(sb.reverse().toString());
        }
        for (int num : arr) {
            boolean flag = true;
            for (int i = 2; i < num; i++){
                if (num%i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && num != 1)
                System.out.print(num + " ");
        }
    }
    public static boolean isPrime(int num){
        if (num == 1) return false;
        for (int i = 2; i < num; i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void solution(int n) {
        System.out.println("========solution==========");
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n ; i++){
            int tmp = arr[i];
            int reversed = 0;
            while (0 < tmp) {
                int t = tmp % 10;
                reversed = reversed * 10 + t;
                tmp /= 10;
            }
            if (isPrime(reversed))
                answer.add(reversed);
        }
        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
        System.out.println("==========solution end ==========");
    }
}
