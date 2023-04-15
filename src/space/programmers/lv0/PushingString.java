package space.programmers.lv0;

public class PushingString {
    public static int solution(String A, String B) {
        int answer = 0;
        if (A.equals(B))
            return 0;
        String tmp=A;
        for (int i = 0; i < A.length(); ++i){
            ++answer;
            StringBuilder shifted = new StringBuilder();
            char lastChar = tmp.charAt(tmp.length() - 1);
            shifted.append(lastChar).append(tmp.substring(0,tmp.length()-1));
            tmp = shifted.toString();
            if (tmp.equals(B))
                break;
        }
        if(answer == A.length())
            return -1;
        else
            return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("hello","ohell"));
        System.out.println(solution("apple","elppa"));
        System.out.println(solution("atat","tata"));
        System.out.println(solution("abc","abc"));
    }
}
