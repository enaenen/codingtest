package space.baekjoon;
/*
https://www.acmicpc.net/problem/5543

버거+음료를 골라
세트로 구매시 가격의 합계에서 -50

입력 :
상덕버거
중덕버거
하덕버거 의 가격

콜라의 가격
사이다의 가격

모든 가격은 100원이상 2000원 이하

출력 : 가장 싼 세트 메뉴의 가격 출력


버거 + 음료 -50 가격이 가장 싼 가격을 출력


 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class P5543 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minBurgerPrice = 3333;
        int minSodaPrice = 3333;

        for(int i=0;i<3;i++){
            int a = Integer.parseInt(br.readLine());
            if(a<minBurgerPrice) minBurgerPrice=a;
        }
        for(int i=0;i<2;i++){
            int b = Integer.parseInt(br.readLine());
            if (b<minSodaPrice) minSodaPrice=b;
        }
        System.out.println(minBurgerPrice+minSodaPrice-50);
        return;
    }
}
