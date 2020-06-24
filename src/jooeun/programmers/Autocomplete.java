package jooeun.programmers;

import java.util.*;

public class Autocomplete {

    public static void main(String[] args){

        String[] words = {"word","war","warrior","world"};
        System.out.println(solution(words));
    }

    public static int solution(String[] words){
        int answer = 0;
        int[] match = new int[words.length - 1];

        //사전순으로 정렬
        Arrays.sort(words);

        for(String s : words){
            System.out.print(s + "     ");
        }
        System.out.println();

        //앞 뒤 비교 시작
        for(int i = 0 ; i < words.length -1 ; i++){

            int idx;
            //뒤의 단어가 앞의단어랑 몇개나 같은지 체크
            for(idx = 1 ; idx <= words[i].length() ; idx++){

                //idx 범위 체크
                if(idx <= words[i+1].length()){
                    if(!words[i+1].substring(0,idx).equals(words[i].substring(0,idx)))
                        break;
                }else
                    break;
            }

            match[i] = idx-1;
        }

        for(int i : match){
            System.out.print(i + "        ");
        }
        System.out.println();

        if(match[0] == words[0].length()){
            answer += words[0].length();
        }else{
            answer += match[0] + 1;
        }
        System.out.println(answer);

        for(int i = 1 ; i <= match.length -1 ; i++){

            if(match[i -1] > match[i]){
                answer += match[i-1] + 1;
            }else{

                answer += match[i] + 1;
            }
            System.out.println(answer);

        }

        if(match[match.length -1 ] == words[words.length - 1].length()){
            answer += match[match.length -1];
        }else{
            answer += match[match.length -1] + 1;
        }

        return answer;
    }

//    public static int solution(String[] words){
//        int answer = 0;
//
//        Arrays.sort(words);
//
//        for(String s : words){
//            System.out.print(s + "  ");
//        }
//        System.out.println();
//
//        for(int i = 0 ; i < words.length ;i++){
//
//            int len_now = words[i].length();
//
//            //맨 처음 단어일 경우 --> 뒤의 단어하고만 비교
//           if(i == 0){
//
//               //지금 단어가 비교할 뒤의 단어보다 같거나 짧을 경우에만
//               if(len_now <= words[i+1].length()) {
//
//                   if (words[i + 1].substring(0, len_now).equals(words[i])) {
//                       answer += len_now;
//                   } else {
//                       answer += 2;
//                   }
//               }//비교할 뒤의 단어보다 길다
//               else{
//                   answer += 2;
//               }
//
//           }//맨 마지막 단어일 경우 --> 앞의 단어하고만 비교
//           else if(i == words.length -1 ){
//
//               int len_before = words[i -1].length();
//
//               //지금 단어가 앞의 단어보다 길어야 비교가 가능하다
//               if(len_before <= len_now){
//                   if(words[i].substring(0,len_before).equals(words[i-1])){
//                       answer += len_before+1;
//                   }else{
//                       answer += 2;
//                   }
//               }//비교할 앞의 단어보다 짧다
//               else{
//                   answer += 2;
//               }
//
//           }else{
//
//               System.out.println(words[i]);
//
//               int len_before = words[i -1].length();
//               boolean check_len_before = false;
//               boolean check_len_after = false;
//
//               //앞의 단어가 짧거나 같을 경우
//               if(len_before <= len_now)
//                   //앞의 단어 비교 가능
//                   check_len_before = true;
//               else
//                   //앞의 단어 비교 불가능
//                   check_len_before = false;
//
//               //내 단어가 뒤의 단어보다 짧거나 같을 경우
//               if(len_now <= words[i+1].length())
//                   //뒤의 단어 비교 가능
//                   check_len_after = true;
//               else
//                   //뒤의 단어 비교 불가능
//                   check_len_after = false;
//
//               System.out.println(check_len_before + "    " + check_len_after);
//
//
//               //앞의 단어 비교, 뒤의 단어 비교
//               if(check_len_before && check_len_after){
//
//                   //내 단어가 앞의 단어랑 겹친다.
//                   if(words[i].substring(0,len_before).equals(words[i-1])){
//                       //내 단어가 뒤의 단어랑 겹친다 --> 내 단어 다 입력해야함.
//                       if(words[i + 1].substring(0,len_now).equals(words[i]))
//                           answer += len_now;
//                           //뒤의 단어랑 안겹친다 --> 내가 마지막, 앞에 단어 길이보다 +1 해야함.
//                       else
//                           answer += len_before+1;
//                   }//앞의 단어랑 안겹친다.
//                   else{
//                       //뒤의 단어랑 겹친다 --> 내 단어 다 입력해야함.
//                       if(words[i + 1].substring(0,len_now).equals(words[i]))
//                           answer += len_now;
//                           //뒤의 단어랑 안겹친다 --> 유일한 단어. 2글자만 입력해도 됨.
//                       else
//                           answer += 2;
//                   }
//
//               }//앞의 단어만 체크 가능
//               else if(check_len_before){
//
//                   if(words[i].substring(0,len_before).equals(words[i-1]))
//                       answer += len_before+1;
//                   else
//                       answer += 2;
//
//               }//뒤의 단어만 체크 가능
//               else if(check_len_after){
//                   //뒤의 단어랑 겹친다 --> 내 단어 다 입력해야함.
//                   if(words[i + 1].substring(0,len_now).equals(words[i]))
//                       answer += len_now;
//                       //뒤의 단어랑 안겹친다 --> 유일한 단어. 2글자만 입력해도 됨.
//                   else
//                       answer += 2;
//               }
//           }
//
//            System.out.println("answer : " + answer);
//
//        }
//
//        return answer;
//    }
}
