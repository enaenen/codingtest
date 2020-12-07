package space.baekjoon.codeplus.deque;

import java.io.*;

//백준 10866
public class MyDeque {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNum = Integer.parseInt(br.readLine());
        int[] deque = new int[10000];
        int front = 0;
        int back = 1;
        int size = 0;
        while (caseNum-- > 0) {
            String inputString = br.readLine();
            String[] commandList = inputString.split(" ");
            String command = commandList[0];


            if (command.equals("push_front")) {
                int inputNumber = Integer.parseInt(commandList[1]);
                deque[front++] = inputNumber;
                back++;
                size++;

            } else if (command.equals("push_back")) {
                if (back == deque.length) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                } else {
                    int inputNumber = Integer.parseInt(commandList[1]);
                    deque[back++] = inputNumber;
                    size++;
                }
            } else if (command.equals("pop_front")) {
                if (size == 0) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                } else {
                    int frontNumber = deque[front - 1];
                    size--;
                    bw.write(String.valueOf(frontNumber));
                    bw.newLine();
                }
            } else if (command.equals("pop_back")) {
                if (size == 0) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                } else {
                    int backNumber = deque[back - 1];
                    size--;
                    bw.write(String.valueOf(backNumber));
                    bw.newLine();
                }
            } else if (command.equals("size")) {
                bw.write(String.valueOf(size));
                bw.newLine();
            } else if (command.equals("empty")) {
                if (size == 0) {
                    bw.write(String.valueOf(1));
                    bw.newLine();
                } else {
                    bw.write(String.valueOf(0));
                    bw.newLine();
                }
            } else if (command.equals("front")) {
                if (size == 0) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                } else {
                    int frontNumber = deque[front - 1];
                    bw.write(String.valueOf(frontNumber));
                    bw.newLine();
                }

            } else if (command.equals("back")) {
                if (size == 0) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
                } else {
                    int backNumber = deque[back - 1];
                    bw.write(String.valueOf(backNumber));
                    bw.newLine();
                }
            }
        }
        bw.close();
    }
}
