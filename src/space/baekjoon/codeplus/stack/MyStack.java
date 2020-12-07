package space.baekjoon.codeplus.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stack = new int[n];
        int size=0;

        while(n-- > 0){
            String cmd = sc.next();
            if(cmd.equals("push")){
                int inputNumber = Integer.parseInt(sc.next());
                stack[size]=inputNumber;
                size++;
            }
            else if (cmd.equals("top")){
                if(size<=0){
                    System.out.println(-1);
                    continue;
                }
                System.out.println(stack[size-1]);
            }
            else if (cmd.equals("size")){
                System.out.println(size);
            }
            else if(cmd.equals("empty")){
                if(size<=0){
                    System.out.println(1);
                    continue;
                }
                System.out.println(0);
            }
            else if(cmd.equals("pop")){
                if(size<=0){
                    System.out.println(-1);
                    continue;
                }
                System.out.println(stack[size-1]);
                size--;
            }

        }

    }


}
