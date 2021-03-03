package jooeun.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {

    public static void main(String[] args){

        // PAHNAPLSIIGYIR
        // PINALSIGYAHRPI
        // String s = "PAYPALISHIRING";
        String s = "AB";
        int numRows = 1;

        String answer = solution(s, numRows);
        System.out.println(answer);
    }

    public static String solution(String s, int numRows){

        if(s.length() == 1 || numRows == 1){
            return s;
        }else if(s.length() == 0 || s == null){
            return "";
        }

        StringBuilder answer = new StringBuilder();
        List<Character>[] list = new ArrayList[numRows];

        for(int i = 0 ; i < numRows; i++){
            list[i] = new ArrayList<Character>();
        }

        char[] s_to_ary = s.toCharArray();
        int idx = 0;
        int row = 0;
        final int div_num = (numRows -1)*2;

        while(idx < s_to_ary.length){

            list[row].add(s_to_ary[idx]);

            if((0 <= idx % div_num)  && (idx % div_num < div_num/2))
                row++;
            else
                row--;

            idx++;
        }

        for(row = 0 ; row < numRows; row++){
            for(char c : list[row]){
                answer.append(c);
            }
        }

        return answer.toString();
    }

}
