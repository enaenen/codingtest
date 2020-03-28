package space.baekjoon;
//https://www.acmicpc.net/problem/14681

/*
X,Y 입력(-1000<=X,Y<=100)
0은 없음


츨력: 1~4
어떤 사분면에 속하는지 출력

X와 Y값이 어떤 사분면에 가야하는지?
1: X,Y가 모두 양수   X>0 && Y>0
2: X는 음수 Y 는 양수 X<0 && Y>0
3: X,Y가 모두 음수   X<0 && Y<0
4: X는 양수, Y는 음수 X>0 && Y<0

 */

import java.util.Scanner;

public class P14681 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if((x>0) && (y>0)){
            System.out.println("1");
        }
        else if(x>0){
            System.out.println("4");
        }
        else if(y>0){
            System.out.println("2");
        }
        else{
            System.out.println("3");
        }

        return;
    }
}
