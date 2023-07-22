package space.vivarepub;

import java.util.*;

public class P3 {
    public static void main(String[] args) {
        String[] merchantNames = {"비바리퍼블리", "토스커피사일로 베이커리", "비바리퍼블리카 식당", "토스커피사일", "토스커피사일로 베이커", "비바리퍼블리카식",
                "토스커피사일로 베이", "토스커피사일로&베이커리"};
        solution(merchantNames);
    }

    /**
     *
     * @param merchantNames
     * @return
     */
    public static String[] solution(String[] merchantNames) {
        String[] answer = {};
        //merchantNames 에서 특무순자 &,(,),.,\\,,- 가 포함된 경우만 찾는다.
        // 특수문자가 포함된 경우가 아니면 출력하지 않는다
        String[] clone = merchantNames.clone();

        for (int i = 0; i < clone.length; i++) {
            clone[i] = clone[i].replaceAll("[&,\\-()]", "");
        }
        Arrays.sort(clone);
        for (String s : clone) {
            System.out.println(s);
        }
        /*
        Set<String> list = new HashSet<>();
        for (int i = 0; i < merchantNames.length; ++i) {
            boolean containsSpecialChars = merchantNames[i].matches(".*[&\\-()&].*");
            if (containsSpecialChars) {
                if (!list.contains(merchantNames[i].replaceAll("[&,\\-()]", "")))
                    list.add(merchantNames[i]);
            }
        }

         */
        return answer;
    }
}
