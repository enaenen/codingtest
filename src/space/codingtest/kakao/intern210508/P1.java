package space.codingtest.kakao.intern210508;

public class P1 {
    public static void main(String[] args) {
        System.out.println(solution("zerozero1zerozero09"));
        solution("one4seveneight");
        solution("23four5six7");
        solution("2three45sixseven");
        solution("123");
    }
    public static int solution(String s) {
        int answer = 0;
        s=s.replace("zero","0");
        s=s.replace("one","1");
        s=s.replace("two","2");
        s=s.replace("three","3");
        s=s.replace("four","4");
        s=s.replace("five","5");
        s=s.replace("six","6");
        s=s.replace("seven","7");
        s=s.replace("eight","8");
        s=s.replace("nine","9");
        return answer = Integer.parseInt(s);
    }
}
