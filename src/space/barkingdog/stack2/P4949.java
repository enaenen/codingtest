package space.barkingdog.stack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuffer answer = new StringBuffer();
        Stack braceletStack = new Stack<Character>();
        String opens = "({[";
        String closes = ")}]";
        while (!line.equals(".")) {
            boolean isError = false;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '(' || line.charAt(i) == '{' || line.charAt(i) == '[')
                    braceletStack.push(line.charAt(i));
                //닫는 괄호일때
                else if (line.charAt(i) == ')' || line.charAt(i) == '}' || line.charAt(i) == ']') {
                    //만약 스택에 여는괄호가 없으면 바로 no
                    if (braceletStack.isEmpty()) {
                        isError = true;
                        break;
                    }
                    // 스택에 뭔가는 있음
                    // 여는괄호랑 닫는괄호가 매칭이 되는지 확인
                    // 안마증면 바로 false
                    for (int j = 0; j < closes.length(); j++) {
                        if (line.charAt(i) == closes.charAt(j))
                            if ((char) braceletStack.peek() != opens.charAt(j)) {
                                isError = true;
                                break;
                            }
                    }
                    // 여는 괄호 pop
                    braceletStack.pop();
                }
            }
            if (!braceletStack.isEmpty() || isError)
                answer.append("no\n");
            else
                answer.append("yes\n");
            braceletStack.clear();
            line = br.readLine();
        }
        System.out.println(answer.toString());
    }
}
