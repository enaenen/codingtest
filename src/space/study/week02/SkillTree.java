package space.study.week02;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 * 21-04-08 스킬트리
 */
public class SkillTree {
    public static void main(String[] args) {
        System.out.println(solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            String skillTree = skill_trees[i];
            int previousSkill = 0;
            boolean isAvailable = true;
            for (int j = 0; j < skillTree.length(); j++) {
                if (skill.indexOf(skillTree.charAt(j)) != -1) {
                    if (skill.charAt(previousSkill) == skillTree.charAt(j))
                        previousSkill++;
                    else {
                        isAvailable = false;
                        break;
                    }
                }
            }
            if(isAvailable)
                answer++;
        }
        return answer;
    }
}
