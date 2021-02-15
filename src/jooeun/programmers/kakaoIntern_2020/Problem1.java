package jooeun.programmers.kakaoIntern_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {

    static List<Long> num_list;
    static List<String> operator_list;

    static List<Long> calc;
    static List<String> calc_opr;

    public static void main(String[] args){

        String expression= "100-200*300-500+20";

//        solution(expression);
        System.out.println("MAX VALUE : " + solution(expression));

    }

    public static long solution(String s){

        long max = Integer.MIN_VALUE;
        long sum = 0;

        // 연산자 분리
        operator_list = new ArrayList<>(Arrays.asList(s.split("[0-9]")));
        operator_list.removeIf(string -> (string.equals("")));

        // 숫자 분리
        String[] num_str = s.split("[*,[-],+]");
        num_list = new ArrayList<>();
        for(int i = 0 ; i < num_str.length; i++){
            num_list.add(Long.parseLong(num_str[i]));
        }

        //연산자 우선순위를 정하는 operation array
        String[][] operator_order = {{"*", "+", "-"},{"*", "-", "+"}
                                    ,{"+", "-", "*"},{"+", "*", "-"}
                                    ,{"-", "+", "*"},{"-", "*", "+"}};

        calc = new ArrayList<>(num_list);
        calc_opr = new ArrayList<>(operator_list);

        //  0     1     2    3      4
        // 100   200   300   500    20
        //     0     1     2     3
        //     -     *     -     +

        for(int i = 0 ; i < operator_order.length; i++){

            // 계산하기 위한 list 초기화
            calc.clear();
            calc_opr.clear();

            calc.addAll(num_list);
            calc_opr.addAll(operator_list);

            for(int j = 0 ; j < 3; j++){
                toOperation(operator_order[i][j]);
            }

            sum = Math.abs(calc.get(0));

            if(max < sum){
                max = sum;
            }

        }


        return max;
    }

    private static long calculation(long num1, long num2, String operator){

        if(operator.equals("*")){
            return num1 * num2;
        }else if(operator.equals("+")){
            return num1 + num2;
        }else{
            return num1 - num2;
        }
    }

    private static void toOperation(String operator){

        int idx = 0;

        while(idx < calc_opr.size()){

            if(calc_opr.get(idx).equals(operator)){

                calc.set(idx, calculation(calc.get(idx), calc.get(idx + 1), operator));
                calc.remove(idx+1);
                calc_opr.remove(idx);

            }else{
                idx++;
            }

        }

        return ;

    }

}
