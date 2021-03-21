//package jooeun.codingtest.line2021_단계별;
//
//import java.util.*;
//import java.util.regex.Pattern;
//
//public class Solution1 {
//
//    public static void main(String[] args){
//
//        String program = "line";
//        String[] flag_rules = {"-s STRING", "-n NUMBER", "-e NULL"};
////        String[] commands = {"line -n 100 -s hi -e", "lien -s Bye"};
//        String[] commands = {"line -s 123 -n HI", "line fun"};
//
//        boolean[] answer = solution(program, flag_rules, commands);
//
//        for(boolean b : answer)
//            System.out.print(b + "  ");
//    }
//
//    public static boolean[] solution(String program, String[] flag_rules, String[] commands) {
//
//        String[] temp;
//
//        // key : flag name, value : flag_rule class
//        HashMap<String, FlagRule> rule_map = new HashMap<>();
//
//        // flag_rules parsing
//        for(int i = 0 ; i < flag_rules.length; i++){
//
//            temp = flag_rules[i].split(" ");
//            rule_map.put(temp[0].substring(1), new FlagRule(temp[0],temp[1]));
//        }
//
//        boolean[] answer = new boolean[commands.length];
//
//        // 여러개의 명령어로 이루어져있을 경우, 해당 명령어가 틀린지 체크하는 flag
//        boolean false_flag;
//
//        // commands parsing
//        for(int i = 0 ; i < commands.length; i++){
//
//            false_flag =false;
//            temp = commands[i].split("-");  // {line / n 100 / s hi / e}, {lien / s Bye}
//
//            // command 의 첫번째는 항상 해당 프로그램의 이름이므로, 해당 프로그램이 맞는지 검사
//            if(temp[0].equals(program + " ")){
//
//                for(int idx = 1; idx < temp.length; idx++){
//
//                    // correct commend
//                    if(isCorrectFlagRule(temp[idx], rule_map))
//                        false_flag = false;
//                    // incorrect commend
//                    else {
//                        false_flag = true;
//                        break;
//                    }
//                }
//
//                // 하나라도 틀린 명령어가 존재함
//                if(false_flag)
//                    answer[i] = false;
//                else
//                    answer[i] = true;
//            } else
//                answer[i] = false;
//        }
//        return answer;
//    }
//
//    private static boolean isCorrectFlagRule(String flag_rule, HashMap<String,FlagRule> map){
//
//        // 0 -> flag name, 1 -> flag argument
//        String[] temp = flag_rule.split(" ");
//
//        if(!map.containsKey(temp[0]))
//            return false;
//
//        FlagRule rule = map.get(temp[0]);
//        String regex;
//        boolean isCorrect = false;
//
//        if(rule.flag_argument_type.equals("STRING")) {
//            regex = "^[a-zA-Z]*$";
//            if(Pattern.matches(regex, temp[1]))
//                isCorrect = true;
//        }
//        else if(rule.flag_argument_type.equals("NUMBER")){
//            regex = "^[0-9]*$";
//            if(Pattern.matches(regex, temp[1]))
//                isCorrect = true;
//        }else{
//            if(temp.length > 1)
//                return false;
//            else
//                return true;
//        }
//
//        return isCorrect;
//    }
//
//}
//class FlagRule{
//    String flag_name;
//    String flag_argument_type;
//
//    public FlagRule(){}
//    public FlagRule(String flag_name, String flag_argument_type){
//        this.flag_name = flag_name.substring(1, flag_name.length());
//        this.flag_argument_type = flag_argument_type;
//
//    }
//    public FlagRule(String string){
//        String[] temp = string.split(" ");
//
//        this.flag_name = temp[0];
//        this.flag_argument_type = temp[1];
//    }
//}
