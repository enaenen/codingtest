package space.baekjoon.codeplus.stack;


import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseCount = Integer.parseInt(br.readLine());
        while(caseCount-- > 0){
            StringBuilder answer = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()) {
                char[] charArray = st.nextToken().toCharArray();
                answer.append(reverse(charArray));
                answer.append(" ");
            }
            bw.write(answer.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
    public static StringBuilder reverse(char[] chars){
        Stack<Character> stack = new Stack<Character>();
        for(char alphabet : chars){
            stack.add(alphabet);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()){
            sb.append(stack.pop());
        }
        return sb;
    }
}
