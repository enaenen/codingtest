package space.baekjoon.codeplus.stack;

import java.io.*;
import java.util.Stack;

//핵심
// - Stack 에 인덱스를 저장
// -

public class BJ17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String[] inputNumbers = br.readLine().split(" ");
        int[] nge = new int[size];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        for(int i=1;i<size;i++){
            if(stack.empty()) stack.push(i);
            //스택이 비어있지않고, 입력배열[stack안의 인덱스] < 입력배열[현재인덱스] 라면, nge[스택에 들어있는 인덱스]에 입력배열[현재인덱스]의 숫자들을 넣어준다.
            while(!stack.empty() && Integer.parseInt(inputNumbers[stack.peek()])<Integer.parseInt(inputNumbers[i])){
                nge[stack.pop()]=Integer.parseInt(inputNumbers[i]);
            }
            //마지막 index를 위한 push
            stack.push(i);
        }
        //Stack에 남은 숫자들이 있다면 -1 로 처리
        while(!stack.empty()){
            nge[stack.pop()]=-1;
        }
        for (int i : nge) {
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}
