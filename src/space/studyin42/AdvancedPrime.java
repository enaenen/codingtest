package space.studyin42;

import java.util.Scanner;

public class AdvancedPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] check = new int[n + 1];
        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (check[i] == 0) {
                for (int j = i; j <= n; j = j + i) {
                    if(check[j] != 1) {
                        primeCount++;
                        if (primeCount == k) {
                            System.out.println(j);
                            return ;
                        }
                        check[j] = 1;
                    }
                }
            }
        }
    }
}
