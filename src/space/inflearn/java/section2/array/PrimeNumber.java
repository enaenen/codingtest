package space.inflearn.java.section2.array;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] check = new int[n + 1];
        int primeCount = 0;
        for (int i = 2; i <= n; i++){
            if (check[i] == 0){
                primeCount++;
                for (int j = i; j <= n; j=j+i)
                    check[j] = 1;
            }
        }
        System.out.println(primeCount);
    }
}
