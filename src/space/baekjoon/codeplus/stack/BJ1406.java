package space.baekjoon.codeplus.stack;


import java.io.*;
import java.util.Stack;
/*
처음에 입력한 문자 M
+
나중에 추가될 문자 N
O(M + N)
 */
public class BJ1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputWord = br.readLine();

        Stack<Character> leftFromCursor = new Stack<>();
        Stack<Character> rightFromCursor = new Stack<>();

        char[] charArray = inputWord.toCharArray();
        for (char character : charArray) {
            leftFromCursor.add(character);
        }

        int commandCounter = Integer.parseInt(br.readLine());
        while(commandCounter-->0){
            String command = br.readLine();
            char[] commandChar = command.toCharArray();
            if(commandChar[0]=='P'){
                char add = commandChar[2];
                leftFromCursor.add(add);
            }
            else if(commandChar[0]=='L'){
                if(leftFromCursor.empty()){
                    continue;
                }else{
                    rightFromCursor.add(leftFromCursor.pop());
                }
            }
            else if(commandChar[0]=='D'){
                if(rightFromCursor.empty()){
                    continue;
                }else{
                    leftFromCursor.add(rightFromCursor.pop());
                }
            }
            else if(commandChar[0]=='B'){
                if(leftFromCursor.empty())continue;
                else{
                    leftFromCursor.pop();
                }
            }
        }
        for (Character character : leftFromCursor) {
            bw.write(character);
        }
        while(!rightFromCursor.empty()){//오른쪽은 거꾸로 저장되어있기때문에 pop으로 꺼냄
            bw.write(rightFromCursor.pop());
        }
        bw.flush();
        bw.close();
    }
}
