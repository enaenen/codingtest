package space.baekjoon.codeplus.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MyQueue {
    private static int start;
    private static int end;
    private static int[] queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] queue = new int[10000];
        int start = 0;
        int end = 0;
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String inputString = br.readLine();
            String[] commandArray = inputString.split(" ");
            String command=commandArray[0];
            if(command.equals("push")){
                push(Integer.parseInt(commandArray[1]));
            }
            else if(command.equals("pop")) System.out.println(pop());
            else if(command.equals("size")) System.out.println(size());
            else if(command.equals("empty")) System.out.println(empty());
            else if(command.equals("front")) System.out.println(front());
            else if(command.equals("back")) System.out.println(back());
        }
    }

    static void push(int inputNumber) {
        queue[end] = inputNumber;
        end++;
    }

    static int pop() {
        if (empty()==1) return -1;
        int startNum = queue[start];
        start++;
        return startNum;
    }

    static int empty() {
        if (start == end) return 1;
        else return 0;
    }

    static int size() {
        return end - start;
    }

    static int front() {
        return queue[start];
    }

    static int back() {
        return queue[end - 1];
    }
}
