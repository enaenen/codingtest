package jooeun.LeetCode;

public class StringToIntegerAtoi {

    public static void main(String[] args) {

        String s = " ";
        int answer = solution(s);

        System.out.println("ANSWER : " + answer);
    }

    public static int solution(String s){

        if(s == null || s.equals(""))
            return 0;

        char[] ary = s.toCharArray();
        boolean check_continue = true;
        boolean is_minus = false;
        int idx = -1;

        while(check_continue){

            idx++;
            if(idx >= ary.length)
                break;

            if(ary[idx] == ' '){    // white space
                check_continue = true;
            } else if(ary[idx] == '+'){ // +
                check_continue = false;
                is_minus = false;
                idx++;
            } else if(ary[idx] == '-'){ // -
                check_continue = false;
                is_minus = true;
                idx++;
            }
            else{
                check_continue = false;
            }
        }

        System.out.println(idx);
        int[] s_index = checkIndex(ary, idx);
        System.out.println(s_index[0] + ",  " + s_index[1]);
        if(s_index[1] == -1)
            return 0;
        else
            return parseInteger(new StringBuilder(s.substring(s_index[0], s_index[1])), is_minus);
    }

    private static int[] checkIndex(char[] ary, int s_idx){

        int[] index_ary = {s_idx, -1};

        while(s_idx < ary.length){

            if('0' <= ary[s_idx] && ary[s_idx] <= '9')
                s_idx++;
            else
                break;
        }

        index_ary[1] = s_idx;

        return index_ary;
    }

    private static int parseInteger(StringBuilder sb, boolean is_minus){
        if(sb.length() == 0)
            return 0;
        else{
            if(is_minus){
                try{
                    return -Integer.parseInt(sb.toString());
                }catch(NumberFormatException e){
                    return Integer.MIN_VALUE;
                }
            } else {
                try {
                    return Integer.parseInt(sb.toString());
                }catch(NumberFormatException e){
                    return Integer.MAX_VALUE;
                }
            }
        }
    }

}
