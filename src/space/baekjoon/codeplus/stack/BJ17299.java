package space.baekjoon.codeplus.stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        int[] ngf = new int[size];
        int[] inputNumbers = new int[size];
        int[] counter = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for(int i=0;i<size;i++){
            inputNumbers[i]=Integer.parseInt(st.nextToken());
            counter[inputNumbers[i]-1]++;
        }
        stack.push(0);
        for(int i=1;i<size;i++){
            if(stack.empty()) stack.push(i);
            while(!stack.empty() && counter[inputNumbers[stack.peek()]-1] < counter[inputNumbers[i]-1]){
                ngf[stack.pop()]=inputNumbers[i];
            }
            stack.push(i);
        }
        while(!stack.empty()){
            ngf[stack.pop()]=-1;
        }
        for (int i : ngf) {
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
    }
}
