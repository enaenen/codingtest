package space.programmers.lv0;

public class Babbling {
    public static int solution(String[] babbling) {
        int answer = 0;
        String[] available = {"aya", "ye","woo","ma"};

        for (String s : babbling) {
            int sum = s.length();
            for (String matchingWord : available) {
                if (s.contains(matchingWord))
                    sum -= matchingWord.length();
            }
            if (sum == 0)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"aya","yee","u","maa","wyeoo"}));
        System.out.println(solution(new String[] {"ayaye","uuuma","ye","yemawoo","ayaa"}));
    }
}

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */