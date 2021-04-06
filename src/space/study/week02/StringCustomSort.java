package space.study.week02;

import java.util.Arrays;
import java.util.Comparator;

public class StringCustomSort {
    public static void main(String[] args) {
        String[] s1 = solution3(new String[]{"sun", "bed", "car"}, 1);
        String[] s2 = solution3(new String[]{"abce", "abcd", "cdx"}, 2);
        for (String s : s1) {
            System.out.println(s);
        }
        System.out.println("=================");
        for (String s : s2) {
            System.out.println(s);
        }
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer;
// n 기준으로 선택정렬 이후 같을경우 String 전체의 사전순 정렬
        for (int i = 0; i < strings.length - 1; i++) {
            String min = strings[i];
            int j;
            int minIndex=-1;
            for (j = i + 1; j < strings.length; j++) {
                if (strings[j].charAt(n) < min.charAt(n)) {
                    min = strings[j];
                    minIndex=j;
                }
                else if (strings[j].charAt(n) == min.charAt(n) && (strings[i].compareTo(strings[j]) > 0)) {
                    min = strings[j];
                    minIndex=j;
                }
            }
            if (min != strings[i]) {
                String temp = strings[i];
                strings[i] = min;
                strings[minIndex] = temp;
            }

        }
        answer = strings;
        return answer;
    }


    public static String[] solution2(String[] strings, int n) {
        String[] answer;
        Arrays.sort(strings);
        for (int i = 0; i < strings.length - 1; i++) {
            String min = strings[i];
            int minIndex=-1;
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[j].charAt(n) < min.charAt(n)) {
                    min = strings[j];
                    minIndex=j;
                }
            }
            if (min != strings[i]) {
                String temp = strings[i];
                strings[i] = min;
                strings[minIndex] = temp;
            }
        }
        answer = strings;
        return answer;
    }

    public static String[] solution3(String[] strings, int n) {
        String[] answer;
        Comparator<String> compare = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);

                if(c1 > c2)
                    return 1;
                else if (c1 < c2)
                    return -1;
                else
                    return 0;
            }
        };
        Arrays.sort(strings);
        Arrays.sort(strings, compare);
        answer = strings;
        return answer;
    }
}
