package space.baekjoon.function;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/1065

한수
각 자리수가 등차수열인 수

입력
N
출력
1보다 크고 N보다 작거나 같은 수들 중
한수의 갯수를 출력

0~99까지는 비교할 자리가 없으므로 공차가 n자리, n-1자리 밖에없으므로 다 한수가된다.

자리수가 3개일때부터
n%10 : A
(n/10)%10 : B
(n/100)%10 : C
A-B
B-C 가 같으면 한수
 */
public class P1065 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        if(number.length()<3)
            System.out.println(number);
        else {
            int counter = 99;
            int[] check = new int[number.length()];
            for(int k=100;k<=Integer.parseInt(number);k++) {
                int divider = 1;
                int jaleetsu = (int)(Math.log10(k)+1);
                for (int i = 0; i < jaleetsu; i++) {
                    check[i] = (k / divider) % 10;
                    divider *= 10;
                }

//                for(int n : check){
//                    System.out.println(n);
//                }
                    if (((check[jaleetsu - 1]) - (check[jaleetsu - 2])) == ((check[jaleetsu - 2]) - (check[jaleetsu - 3]))) {
                        for(int a : check){
                            System.out.print(a);
                        }
                        System.out.println();
                        counter++;
                    }
                }

            System.out.println(counter);
            }

        }

}