package space.codingtest.kakao.Intern0509;

import java.util.ArrayList;

public class Kintern2 {
    public static void main(String[] args){
        System.out.println(solution("100-200*300-500+20"));
        System.out.println(solution("50*6-3*2"));
    }


    public static long solution(String expression){
        String[][] symbols = {
                {"+","-","*"},
                {"+","*","-"},
                {"-","+","*"},
                {"-","*","+"},
                {"*","+","-"},
                {"*","-","+"},
        };
        long answer = 0;

        for(int i=0; i<6; i++) {
            long cnt = answer(expression, symbols[i]);
            if(answer < cnt) {
                answer = cnt;
            }
        }
        return answer;
    }
    public static long answer(String expression, String[] combination){
        ArrayList<Long> numList = new ArrayList<Long>(); //숫자관련
        ArrayList<Character> operationList = new ArrayList<Character>(); //연산자 관련
        long answer=0;

        String num = ""; //연사자 외에 숫자들을 임시 저장할 곳

        for(int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i); //string을 char 타입 단위로 나눔

            if(ch == '+' || ch =='-' || ch == '*') {
                numList.add(Long.parseLong(num)); //숫자로 바꿔서 숫자배열에 추가
                operationList.add(ch); //연산자를 연산자배열에 추가
                num = ""; //임시로 저장된 숫자를 비워준다
                continue; //제일 가까운 명령문으로 이동
            }
            num += ch; //연산자 앞까지의 숫자를 임시로 넣어 놓음
        }
        numList.add(Long.parseLong(num)); //마지막 숫자


        for(int j =0 ; j<3; j++) {
            for (int i = 0; i < operationList.size(); i++) {
                if (operationList.get(i) == combination[j].charAt(0)) {
                    long a = numList.get(i);
                    long b = numList.get(i+1);

                    if(combination[j].charAt(0) == '+') {
                        numList.set(i + 1, a + b);
                    }
                    else if(combination[j].charAt(0) == '-') {
                        numList.set(i + 1, a - b);
                    }
                    else if(combination[j].charAt(0) == '*') {
                        numList.set(i + 1, a * b);
                    }

                    numList.remove(i);
                    operationList.remove(i);
                    i--;
                }
            }
        }
        return Math.abs(numList.get(0));
    }
}
