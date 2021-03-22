package jooeun.codingtest.soma_2021;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    static List<List<Character>> answer;
    static Skill_Information[] skill_infos;

    public static void main(String[] args){

        String skills = "h g f w r";
        int n = 4;
        String[] linked = {"h g", "h f", "g r","g w"};

        solution(skills, n , linked);

        System.out.println(answer);

    }

    public static List<List<Character>> solution(String skills, int n, String[] linked){

        // 스킬 이름은 대소문자를 구분함
        skill_infos = new Skill_Information[54];
        List<Character> skill_list = parseSkills(skills);

        // 스킬 이름 정보 파싱 및 클래스 생성
        for(Character c : skill_list)
            skill_infos[c - 'a'] = new Skill_Information(c);


        for(int i = 0 ; i < linked.length; i++){

            // 각 클래스에 연계 스킬 정보 저장
            skill_infos[linked[i].charAt(0) - 'a'].linked_skill.add(linked[i].charAt(2));

            // 단독 스킬인지 여부 판단
            for(int j = i ; j < linked.length; j++){

                if(linked[i].charAt(2) == linked[j].charAt(0)){
                    skill_infos[linked[i].charAt(0) - 'a'].is_single = true;
                    break;
                }
            }
        }

        answer = new ArrayList<List<Character>>();
        List<Character> skill_linked_list;
        Skill_Information skill_info;

        for(Character s_name : skill_list){

            skill_info = skill_infos[s_name - 'a'];

            if(skill_info.is_single){

                skill_linked_list = new ArrayList<Character>();
                skill_linked_list.add(s_name);

                find_skill_tree(skill_info, skill_linked_list);
            }
        }

        return answer;
    }

    private static List<Character> parseSkills(String skills){

        List<Character> skill_list = new ArrayList<Character>();

        for(String s : skills.split(" "))
            skill_list.add(s.charAt(0));

        return skill_list;
    }

    private static void find_skill_tree(Skill_Information skill_info, List<Character> linked){

        // 종료 조건
        if(skill_info.linked_skill.size() < 1){
            if(linked.size() > 1){
                answer.add(new ArrayList<>(linked));
            }
            return ;
        }

        for(Character s_name : skill_info.linked_skill){

            linked.add(s_name);
            find_skill_tree(skill_infos[s_name - 'a'], linked);

            linked.remove(linked.size() - 1);
        }

        return ;
    }
}
class Skill_Information{
    char name;
    List<Character> linked_skill;
    boolean is_single;

    public Skill_Information(){ }

    public Skill_Information(char name){
        this.name = name;
        this.linked_skill = new ArrayList<Character>();
        this.is_single = false;
    }

    public String toString(){
        return "name : " + this.name + ", linked skill : " + linked_skill.toString() + " , is_single : " + this.is_single;
    }
}