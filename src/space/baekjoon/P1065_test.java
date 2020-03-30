package space.baekjoon;

import java.util.Scanner;

public class P1065_test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<100)
            System.out.println(n);
        else {
            int a,b,c;
            int hansu=99;
            for (int i = 100; i <= n; i++) {
                a=i%10;
                b=(i/10)%10;
                c=i/100;
                if((c-b)==(b-a)) {
                    hansu++;
                    System.out.println(i);
                }
            }
            System.out.println(hansu);
        }
    }
}
