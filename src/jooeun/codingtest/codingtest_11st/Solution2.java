package jooeun.codingtest.codingtest_11st;

public class Solution2 {

    public static void main(String[] args) {
        System.out.println(transform("abbcbbb"));
    }

    public static String transform(String input) {
        StringBuilder sb = new StringBuilder("");

        int[] check = new int[27];

        for(char c : input.toCharArray()){
            if(check[c - 'a'] == 0){
                sb.append(c);
                check[c - 'a'] = 1;
            }
        }

        return sb.toString();
    }

}
