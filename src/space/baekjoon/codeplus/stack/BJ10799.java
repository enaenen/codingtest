package space.baekjoon.codeplus.stack;

import java.io.*;
import java.util.Stack;

public class BJ10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine();
        char[] charArray = inputString.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        int answer = 0;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i]=='(') {
                stack.add(charArray[i]);
            }
            else if(charArray[i]==')'){
                stack.pop();
                if(charArray[i-1]=='('){
                    answer+=stack.size();
                }else{
                    answer++;
                }

            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
