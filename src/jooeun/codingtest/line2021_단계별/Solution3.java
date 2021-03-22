package jooeun.codingtest.line2021_단계별;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Solution3 {

    static final String no_alias = "___NONE___";

    public static void main(String[] args){

        String program = "bank";
        String[] flag_rules = {"-send STRING", "-a ALIAS -amount", "-amount NUMBERS"};
        String[] commands = {"bank -send abc -amount 500 200 -a 400", "bank -send abc -a hey"};

        boolean[] answer = solution(program, flag_rules, commands);

        for(boolean b : answer)
            System.out.print(b + "  ");
    }

    public static boolean[] solution(String program, String[] flag_rules, String[] commands) {

        String[] temp;

        // key : flag name, value : flag_rule class
        HashMap<String, FlagRule> rule_map = new HashMap<>();

        // flag_rules parsing
        for(int i = 0 ; i < flag_rules.length; i++){

            temp = flag_rules[i].split(" ");

            if(temp.length == 2)
                rule_map.put(temp[0].substring(1), new FlagRule(temp[0], temp[1]));
        }

        // flag_rules alias parsing
        for(int i = 0 ; i < flag_rules.length; i++){

            temp = flag_rules[i].split(" ");

            if(temp.length == 3){
                String alias = temp[0].substring(1);
                String flag_name = temp[2].substring(1);
                FlagRule rule = rule_map.get(flag_name);

                rule.setNewAlias(alias,flag_name);
                rule_map.put(alias,rule);
            }
        }

        boolean[] answer = new boolean[commands.length];

        // 여러개의 명령어로 이루어져있을 경우, 해당 명령어가 틀린지 체크하는 flag
        boolean false_flag;

        // commands parsing
        for(int i = 0 ; i < commands.length; i++){

            false_flag =false;
            temp = commands[i].split("-");  // {line / n 100 / s hi / e}, {lien / s Bye}

            // command 의 첫번째는 항상 해당 프로그램의 이름이므로, 해당 프로그램이 맞는지 검사
            if(temp[0].equals(program + " ")){

                Set<String> already_use = new HashSet<>();

                for(int idx = 1; idx < temp.length; idx++){

                    // correct commend
                    if(isCorrectFlagRule(temp[idx], rule_map))
                        false_flag = false;
                        // incorrect commend
                    else {
                        false_flag = true;
                        break;
                    }
                }

                // 하나라도 틀린 명령어가 존재함
                if(false_flag)
                    answer[i] = false;
                else
                    answer[i] = true;
            } else
                answer[i] = false;
        }
        return answer;
    }


    private static boolean isCorrectFlagRule(String flag_rule, HashMap<String,FlagRule> map){

        // 0 -> flag name, 1 ~ -> flag arguments
        String[] temp = flag_rule.split(" ");

        // flag name 이 없는 경우
        if(!map.containsKey(temp[0]))
            return false;

        FlagRule rule = map.get(temp[0]);
        boolean isCorrect = true;
        String regex;
        int idx = 1;
        if(rule.flag_argument_type.equals("STRINGS")) {

            regex = "^[a-zA-Z]*$";
            for (idx = 1; idx < temp.length; idx++) {

                if(!Pattern.matches(regex, temp[idx])){
                    isCorrect = false;
                    break;
                }
            }
        }
        else if(rule.flag_argument_type.equals("STRING")) {

            if(temp.length < 3){
                regex = "^[a-zA-Z]*$";
                if(!Pattern.matches(regex, temp[idx]))
                    isCorrect = false;
            }else
                isCorrect = false;
        }
        else if(rule.flag_argument_type.equals("NUMBERS")){

            regex = "^[0-9]*$";
            for (idx = 1; idx < temp.length; idx++) {

                if (!Pattern.matches(regex, temp[idx])) {
                    isCorrect = false;
                    break;
                }
            }
        }
        else if(rule.flag_argument_type.equals("NUMBER")){

            if(temp.length < 3){
                regex = "^[0-9]*$";
                if(Pattern.matches(regex,temp[1]))
                    isCorrect = false;
            }else
                isCorrect = false;
        }else
        if (temp.length > 1)
            isCorrect = false;

        return isCorrect;
    }
}
class FlagRule{
    String flag_name;
    String flag_argument_type;
    String alias;

    public FlagRule(){}
    public FlagRule(String flag_name, String flag_argument_type){
        this.flag_name = flag_name.substring(1);
        this.flag_argument_type = flag_argument_type;
        this.alias = "___NONE___";
    }
    public FlagRule(String string){
        String[] temp = string.split(" ");

        this.flag_name = temp[0];
        this.flag_argument_type = temp[1];
        this.alias = "___NONE___";
    }

    public String setNewAlias(String alias, String flag_name){
        if(flag_name.equals(this.flag_name) && !alias.equals(this.flag_name))
            this.alias = alias;

        return this.alias;
    }
}