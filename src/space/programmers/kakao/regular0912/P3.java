package space.programmers.kakao.regular0912;

import java.util.ArrayList;
import java.util.List;

public class P3 {
    public static void main(String[] args) {
        String[] info = {
                "java backend junior pizza 150",
                "python frontend senior chicken 210",
                "python frontend senior chicken 150",
                "cpp backend senior pizza 260",
                "java backend junior chicken 80",
                "python backend senior chicken 50"};
        String[] query = {
                "java and backend and junior and pizza 100",
                "python and frontend and senior and chicken 200",
                "cpp and - and senior and pizza 250",
                "- and backend and senior and - 150",
                "- and - and - and chicken 100",
                "- and - and - and - 150"
        };


        for (int i : solution(info, query)) {
            System.out.println(i);
        }

    }

    public static int[] solution(String[] info, String[] query) {
        int[] answer = {};
        List<Person> list = new ArrayList<Person>();

        for (String onePerson : info) {
            String[] oneInfo = onePerson.split(" ");
            Person p = new Person(oneInfo[0], oneInfo[1], oneInfo[2], oneInfo[3], Integer.parseInt(oneInfo[4]));
            list.add(p);
        }
        answer = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            String[] one = new String[5];
            String oneQuery = query[i];
            one = oneQuery.split("and");
            String[] reOne = one[3].split(" ");
            String[] singeQuery = new String[] {one[0],one[1].trim(),one[2].trim(),reOne[1],reOne[2]};
            int counter = 0;
            for (Person o : list) {
                if (Integer.parseInt(singeQuery[4]) > o.score) continue;
                if (singeQuery[0].equals("-") || !(o.skill.equals(singeQuery[0]))) {
                    continue;
                }
                if (singeQuery[1].equals("-") || !(o.abilities.equals(singeQuery[1]))) {
                    continue;
                }
                if (singeQuery[2].equals("-") || !(o.position.equals(singeQuery[2]))) {
                    continue;
                }
                if (singeQuery[3].equals("-") || !(o.soulfood.equals(singeQuery[3]))) {
                    continue;
                }
                counter++;
            }
            answer[i] = counter;
        }


        return answer;

    }

    static class Person {
        private String skill;
        private String position;
        private String abilities;
        private String soulfood;
        private int score;

        public Person(String skill, String position, String abilities, String soulfood, int score) {
            this.skill = skill;
            this.position = position;
            this.abilities = abilities;
            this.soulfood = soulfood;
            this.score = score;
        }

    }
}
