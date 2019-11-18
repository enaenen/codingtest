package programmers.kakao;

import java.util.*;

public class Level2 {
    public static void main(String[] args) {
        for(int a : solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"))
            System.out.println(a);

    }
        public static int[] solution (String s){
            Map<String, Integer> map = new HashMap<String, Integer>();
            String[] list = s.split("}");
            for (String a : list) {
                a = a.replace("{", ",");
                String[] temp = a.split(",");
                for (String num : temp) {
                    if (!num.equals("")) {
                        if (map.get(num) != null) {
                            map.put(num, map.get(num) + 1);
                        } else {
                            map.put(num, 1);
                        }
                    }
                }
            }
            int size = map.size();
            int[] answer = new int[size];
            System.out.println(map.toString());
            List<String> temp = sort(map);
            for(int i=0;i<temp.size();i++){
                answer[i]=Integer.parseInt(temp.get(i));
            }
            return answer;
        }
        public static List<String> sort (Map map){
            List<String> list = new ArrayList<String>();
            list.addAll(map.keySet());
            Collections.sort(list, (Comparator) (o1, o2) -> {
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                return ((Comparable) v2).compareTo(v1);
            });
            return list;
        }
    }