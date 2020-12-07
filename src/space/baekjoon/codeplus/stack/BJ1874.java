package space.baekjoon.codeplus.stack;


import java.io.*;
        import java.util.Stack;
//Counter는 계속 증가만한다
//Counter 보다 작은 입력값이 있을때, 스택의 맨위에 없을경우 NO 출력
//뭔가 잘못된 코드
public class BJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        int caseNum = Integer.parseInt(br.readLine());
        int counter = 0;
        while (caseNum-- > 0) {
            int inputNumber = Integer.parseInt(br.readLine());
            if (counter < inputNumber) {//오름차순 증가 수열 < 입력된 숫자
                while (counter != inputNumber) {//스택에 수열 쌓기
                    stack.add(++counter);
                    sb.append("+\n");
                }
                stack.pop();//스택에서 꺼내기
                sb.append("-\n");
            } else {//오름차순 증가 수열 > 입력된 숫자
                if (stack.peek() > inputNumber) {//입력된숫자보다 스택에 있는 숫자가 더 큰 경우
                    while (stack.pop() == inputNumber) {//입력된 숫자가 나올때까지 스택에서 꺼냄
                        sb.append("-\n");
                    }
                } else if (stack.peek() == inputNumber) {//스택의 TOP 과 입력된 숫자가 같을경우 POP
                    stack.pop();
                    sb.append("-\n");
                } else {//Counter보다 작은수를 입력했을때, Stack의 Top과 맞지않으면 NO
                    sb = new StringBuilder();
                    sb.append("NO");
                    break;
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
