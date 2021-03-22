package jooeun.LeetCode;


public class LongestPalindromicSubstring {

    String longest_SubString;

    public static void main(String[] args){
//        String s = "ac";
        String s = "baba";
//        String s = "affbaabffa";
//        String s = "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa";
//        String s = "lphntrsqudccteewsdmpjmgmfnxegawjclzobpnxdrvxeygafiwyqsvsecictqkmiqvrdjajfngvlhdezdpqpzjjzbhoyggrbkuzeocrpzqishvfairdvvabopyubfisxbrgnlughbrzunitwowvnsqhdtnkotitgxwzjhbgltksorygpdberdgzgvogrvwluhixfbrfhliedjylxuspjpitwlhdkneonreqrueqphirmgxtqumllqropaefddplspkrtkbmuvwkyryworojlvwzdlacuoqzokrmcgmwkopsbqjjkaoqjqbrderwzmhbhfgwvrjakyfeqcbtvlcgbsxkngymxyievihiskdmmppmmdksihiveiyxmygnkxsbgclvtbcqefykajrvwgfhbhmzwredrbqjqoakjjqbspokwmgcmrkozqoucaldzwvljorowyrykwvumbktrkpslpddfeaporqllmuqtxgmrihpqeurqernoenkdhlwtipjpsuxlyjdeilhfrbfxihulwvrgovgzgdrebdpgyrosktlgbhjzwxgtitokntdhqsnvwowtinuzrbhgulngrbxsifbuypobavvdriafvhsiqzprcoezukbrggyohbzjjzpqpdzedhlvgnfjajdrvqimkqtcicesvsqywifagyexvrdxnpbozlcjwagexnfmgmjpmdsweetccduqsrtnhpl";
//        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
//        String s = "321012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210012321001232100123210123210012321001232100123210123";
        String answer = solution(s);

        System.out.println("ANSWER : " + answer);
    }

    public static String solution(String s){

        if(s == null || s.equals("")) return "";

        char[] ary = s.toCharArray();
        int max = 1;
        int left, right;
        int len = ary.length;
        int range;

        int max_left_idx = 0, max_right_idx = 0;

        for( int i = 0 ; i < len; i++){

            // 짝수
            if(i < len/2) {range = i;}
            else {range = len - i - 2;}

            left = i;
            right = i+ 1;
            for(int dist = 0; dist <= range; dist++){

               if(ary[left - dist] == ary[right + dist]){

                   if(max < (dist+1)*2){

                       max = (dist+1)*2;
                       max_left_idx = left - dist;
                       max_right_idx = right + dist;
                   }
               }else {break;}

            }

            // 홀수
            if(len % 2 == 0 ){
                if(i < len/2){range = i;}
                else {range = len - i - 1 ;}
            }else{
                if(i <= len/2) {range = i;}
                else {range = len - i - 1; }
            }

            left = right = i;

            for(int dist = 0; dist <= range; dist++){

                if(ary[left - dist] == ary[right + dist]){

                    if(max < (dist * 2 + 1)){
                        max = dist*2 + 1 ;
                        max_left_idx = left - dist;
                        max_right_idx = right + dist;
                    }

                }else {break;}
            }
        }

        return s.substring(max_left_idx, max_right_idx + 1);
    }

//    public static String solution(String s){
//
//        String answer = "";
//
//        if(s == null || s.equals(""))
//            return answer;
//
//        int max = Integer.MIN_VALUE;
//        StringBuffer sf;
//        String subString;
//
//        for(int i = 0; i < s.length(); i++){
//
//            for(int j = i + 1; j <= s.length(); j++){
//
//                subString = s.substring(i,j);
//                sf = new StringBuffer(subString);
//
//                if(subString.equals(sf.reverse().toString())){
//
//                    if(max < subString.length()) {
//                        max = subString.length();
//                        answer = subString;
//                    }
//                }
//            }
//
//            if(max == s.length())
//                break;
//        }
//
//        return answer;
//    }
}
