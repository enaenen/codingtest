package space.inflearn.java.section2.review;

import java.util.Scanner;
//0418
//review needed
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] answer = new int[n + 1];
        int primeNumber = 0;
        for (int i = 2; i <= n ; i++)
        {
            if (answer[i] == 0){
                primeNumber++;
                for(int j = i; j <= n; j = j + i)
                    answer[j] = 1;
            }
        }
        System.out.println(primeNumber);
        solution(n);
    }
//    0419
    public static void solution(int n)
    {
        int[] check = new int[n];
        int primeCount = 0;
        for (int i = 2; i < n; i++)
        {
            if (check[i] == 0)
            {
                primeCount++;
                for (int j = i; j < n; j = j + i)
                    check[j] = 1;
            }
        }
        System.out.println(primeCount);
    }
}
