package space.programmers.lv0;

public class AlienAge {
        public String solution(int age) {
            StringBuilder answer = new StringBuilder();
            while (age != 0){
                answer.append((char)(age % 10 + 'a'));
                age /= 10;
            }
            return answer.reverse().toString();
        }

    public static void main(String[] args) {
        System.out.println("args = " + args);
    }
}
