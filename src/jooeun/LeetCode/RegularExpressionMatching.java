package jooeun.LeetCode;

public class RegularExpressionMatching {

    static final char anything = '.';
    static final char repeat_char = '*';

    public static void main(String[] args){
//        String s = "aaa";
//        String p = "a*a";

//        String s = "ab";
//        String p = ".*c";

        String s = "aaa";
        String p = "aaaa";

        boolean answer = solution(s,p);
        System.out.println("ANSWER : " + answer);
    }

    public static boolean solution(String s, String p){

        if(s == null || p == null){ return false; }
        if(s.equals(p)){ return true; }

        int s_idx = 0;
        int p_idx = 0;

        char[] s_ary = s.toCharArray();
        char[] p_ary = p.toCharArray();
        char[][] back_front = {{'$', '&'}, {'$', '&'}};
        //{ {s_back, s_front}, {p_back, p_front}}

        StringBuilder sb = new StringBuilder();
        char starChar = ' ';

        while(s_idx < s_ary.length && p_idx < p_ary.length) {

            System.out.println("\ns_idx : " + s_idx + ", p_idx : " + p_idx);
            System.out.println("비교 string : " + sb.toString());

            if (0 < s_idx)
                back_front[0][0] = s_ary[s_idx - 1];

            if (s_idx < s_ary.length - 1)
                back_front[0][1] = s_ary[s_idx + 1];
            else
                back_front[0][1] = '&';

            if (0 < p_idx)
                back_front[1][0] = p_ary[p_idx - 1];

            if (p_idx < p_ary.length - 1)
                back_front[1][1] = p_ary[p_idx + 1];
            else
                back_front[1][1] = '&';

            System.out.println("s_ary back : " + back_front[0][0] + ", now : " + s_ary[s_idx] + ", s_ary front : " + back_front[0][1]);
            System.out.println("p_ary back : " + back_front[1][0] + ", now : " + p_ary[p_idx] + ", p_ary front : " + back_front[1][1]);

            if (back_front[1][1] == repeat_char) {
                starChar = p_ary[p_idx++];
                System.out.println("Continue");

                if(back_front[1][1] == starChar){
                    s_ary[s_idx + 1] = ' ';

                }
                continue;
            }

            if (p_ary[p_idx] == repeat_char) {

                System.out.println("REPEAT START");
                System.out.println("Star char : " + starChar);
                while (s_idx < s_ary.length) {

                    if (s_ary[s_idx] == starChar || starChar == anything) {

                        sb.append(s_ary[s_idx++]);
                        System.out.println(s_idx + "  ," +sb);
                    } else
                        break;
                }
                p_idx++;
            } else if (p_ary[p_idx] == anything) {
                sb.append(s_ary[s_idx++]);
                p_idx++;
            } else if (s_ary[s_idx] == p_ary[p_idx]) {
                sb.append(s_ary[s_idx++]);
                p_idx++;
            } else
                break;
        }

        if(p_idx < p_ary.length) {
            System.out.println("yes");

            while(p_idx < p_ary.length)
                if(p_ary[p_idx] != s_ary[s_idx - 1])
                    sb.append(p_ary[p_idx++]);
                else
                    break;

        }

        System.out.println(sb);

        if(s.equals(sb.toString()))
            return true;
        else
            return false;
    }
}
