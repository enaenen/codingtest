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
                if(charArray[i-1]=='('){//하나 바로전일때는 레이저
                    answer+=stack.size();//레이저일때는 막대기 개수만큼 조각이 생기기 때문에 + 조각개수
                }else{
                    answer++;//하나 바로전에 여는게 아닐때는 레이저가 아닌 막대기이다.
                    // 레이저가 끝난뒤에 막대기는 레이저 뒤에있는 막대기 조각이 하나가 있으므로 ++
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
