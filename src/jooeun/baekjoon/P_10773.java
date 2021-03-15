package jooeun.baekjoon;

// https://www.acmicpc.net/problem/10773
// https://velog.io/@lshjh4848/Java-스택Stack-클래스-정리
import java.util.*;
import java.io.*;

public class P_10773 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());

        int[] ary = new int[k];
        for(int i = 0 ; i < k ; i++) {
            st = new StringTokenizer(br.readLine());
            ary[i] = Integer.parseInt(st.nextToken());
        }

        int answer = solution(k, ary);
        System.out.println(answer);
    }

    // list 를 이용하는 방법
//    public static int solution(int k , int[] ary){
//
//        List<Integer> list = new ArrayList<Integer>();
//
//        for(int i = 0 ; i < k ; i++){
//
//            if(ary[i] == 0)
//                list.remove(list.size() - 1);
//            else
//                list.add(ary[i]);
//
//        }
//
//        int sum = 0;
//        for(int i : list)
//            sum += i;
//
//        return sum;
//    }

    // stack
    public static int solution(int k, int[] ary){
        Stack<Integer> stack = new Stack<Integer>();

        // 6  0  0  7  0  0  4  5  3  1
        for(int i = 0 ; i < k ; i++){

            if(ary[i] == 0)
                stack.pop();
            else
                stack.push(ary[i]);
        }

        int sum = 0;
        while(!stack.empty())
            sum += stack.pop();

        return sum;
    }
}
