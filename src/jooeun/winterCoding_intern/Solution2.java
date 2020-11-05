package jooeun.winterCoding_intern;

public class Solution2 {

    public static void main(String[] args){

        String encrypted_text = "qyyigoptvfb";
        String key = "abcdefghijk";
        int rotation = 25;

        //hellopython
        String answer = solution(encrypted_text, key, rotation);

        System.out.println(answer);
    }

    public static String solution(String encrypted_text, String key, int rotation) {

        StringBuffer answer = new StringBuffer("");

        int len = encrypted_text.length();
        char[] text_arry = encrypted_text.toCharArray();
        char[] arry_temp = new char[len];

        rotation %= len;

        System.out.println(rotation);

        System.out.println(rotation);
        if(rotation < 0){

            for(int i = 0 ; i < len ; i++){

                if(len-rotation <= i){
                    arry_temp[i - len + rotation] = text_arry[i];
                }else{
                    arry_temp[i] = text_arry[i];
                }

            }

        }else{

            for(int i = 0; i < len; i++){

                if(i < rotation) {
                    arry_temp[len - rotation + i] = text_arry[i];
                }else{
                    arry_temp[i - rotation] = text_arry[i];
                }
            }

        }

        text_arry = arry_temp;

        int[] key_int = new int[len];
        for(int i = 0; i < len ; i++){
            key_int[i] = key.charAt(i) - 'a' + 1;
        }

        //97~122
        //96 -> 122 -> + 26
        //95 -> 121 ->
        //123 -> 97 -> -26
        //124 -> 98

        int char_i ;
            for (int idx = 0; idx < len; idx++) {

                char_i = text_arry[idx] - key_int[idx];

                if(char_i < 97){
                    char_i += 26;
                }else if(122 < char_i){
                    char_i -= 26;
                }

                text_arry[idx] = (char)char_i;
            }

        for (char c : text_arry)
        answer.append(c);

        return answer.toString();
    }

}
