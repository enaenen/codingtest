package space.baekjoon.codeplus.stack;

import java.io.*;
import java.util.Stack;

public class BJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseCount = Integer.parseInt(br.readLine());
        while (caseCount-- > 0) {
            String oneCase = br.readLine();
            bw.write(valid(oneCase.toCharArray()));
            bw.newLine();

        }
        bw.flush();
        bw.close();
    }

    public static String valid(char[] chars) {
        Stack<Character> stack = new Stack<Character>();
        for (char oneChar : chars) {
            if(oneChar=='('){
                stack.push(oneChar);
            }
            else{
                if(stack.empty())
                    return "NO";
                stack.pop();
            }
        }
        if(!stack.empty())
            return "NO";
        else
            return "YES";
    }

}
