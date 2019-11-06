//작성자 : 채우주;
//작성일자 : 2019-11-
//전화번호 목록 문제
//
package programmers.hashmap;

import java.util.Arrays;

public class Test2_1 {
    public static void main(String[] args){
        String[] p1={"97674223", "1195524421","119"};
        String[] p2={"123","456", "789"};
        String[] p3={"12","123", "1235","567","88"};

        System.out.println(solution(p1));//F
        System.out.println(solution(p2));//T
        System.out.println(solution(p3));//F
    }
    public static boolean solution(String[] phone_book){
        int length = phone_book.length;
        //String 배열이므로 sort시 String의 크기순으로 오름차순 정렬된다.
        Arrays.sort(phone_book);
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++) {
                if (phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        return true;
    }

}




// 예전에 풀었떤 풀이
//
//import java.util.Arrays;
//class Solution {
//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//        String cmp;
//        int length = phone_book.length;
//        Arrays.sort(phone_book);
//        for (int i = 0; i < length; i++) {
//            for (int j = i + 1; j < length; j++) {
//                if (phone_book[i].length() > phone_book[j].length()) {
//                    break;
//                }
//                int wordLength = phone_book[i].length();
//                cmp = phone_book[j].substring(0, wordLength);
//                if (cmp.equals(phone_book[i])) {
//                    answer = false;
//                    break;
//                }
//            }
//        }
//        return answer;
//    }
//}
//
//
//
//
//
