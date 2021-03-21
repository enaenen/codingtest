package jooeun.codingtest.line2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1 {

    public static void main(String[] args){

//        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
//        String[] languages = {"PYTHON", "C++", "SQL"};
//        int[] preference = {7,5,5};

        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = { "JAVA", "JAVASCRIPT"};
        int[] preference = {7,5,};

        String answer = solution(table,languages,preference);

        System.out.println(answer);
    }

    public static String solution(String[] table, String[] languages, int[] preference){

        String[] jobs = new String[table.length];
        String[][] lang_order = new String[table.length][5];

        // 언어 선호도 * 직업군 언어 점수의 총합이 가장 높은 직군 리턴

        String[] temp;
        for(int i = 0; i < table.length; i++){

            temp = table[i].split(" ");
            jobs[i] = temp[0];

            // 0 번방 -> 1점
            for(int j = 5; 0 < j; j--){
                lang_order[i][5 - j] = temp[j];
            }
        }

        List<String> max_jobs = new ArrayList<String>();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int[] scores = new int[table.length];

        for(int i = 0 ; i < lang_order.length; i++){

            for(int j = 0 ; j < lang_order[0].length; j++){

                for(int k = 0; k < languages.length; k++){

                    if(lang_order[i][j].equals(languages[k])){
                        sum += (j+1)*preference[k];
                    }
                }
            }

            scores[i] = sum;
            if(sum > max)
                max = sum;

            sum = 0;
        }

        for(int i = 0 ; i < scores.length; i++){
            if(max == scores[i])
                max_jobs.add(jobs[i]);
        }

        if(max_jobs.size() > 1)
            Collections.sort(max_jobs);
        return max_jobs.get(0);
    }
}


