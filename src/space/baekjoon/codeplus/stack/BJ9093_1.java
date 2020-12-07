package space.baekjoon.codeplus.stack;

import java.io.*;
import java.util.Stack;

public class BJ9093_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<Character>();
        while(i -->0){
            StringBuilder sb = new StringBuilder();
             sb.append(br.readLine());
             sb.append("\n");
             for(Character ch : sb.toString().toCharArray()){
                 if(ch=='\n'||ch==' '){
                     while(!stack.empty()){
                         bw.write(stack.pop());
                     }
                     bw.write(ch);
                 }else{
                     stack.push(ch);
                 }
             }
        }
        bw.flush();
    }
}
