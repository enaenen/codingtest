package space.studyin42;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int[] check = new int[end + 1];

        for (int i = 2; i <=end; i++){
            if (check[i] == 0 && start <= i){
                    System.out.println(i);
                for (int j = i; j <= end; j=j+i)
                    check[j] = 1;
            }
        }
    }
}
