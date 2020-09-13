package jooeun.kakaoBlind2021;

import java.util.*;

public class Kakao2 {

    static public void main(String[] args){

        String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course = {2,3,5};

        String[] answer = solution(orders,course);

        for(String s : answer){
            System.out.print(s + "     ");
        }

    }

    static public String[] solution(String[] orders, int[] course) {

        //스카피가 원하는 코스 요리의 구성 개수중에 손님들이 시킨 요리 숫자가 2개 이상이 되는 경우에만 실행
        HashMap<Integer, ArrayList<String>> order_map = new HashMap<Integer, ArrayList<String>>();
        ArrayList<String> all_menu ;
        int course_cnt = 0;

        for(int i = 0 ; i < course.length; i++){

            course_cnt = course[i];
            all_menu = new ArrayList<String>();
            order_map.put(course_cnt, all_menu);

            for(int j = 0 ; j < orders.length ; j++){

                if(orders[j].length() >= course_cnt){

                    all_menu = order_map.get(course_cnt);
                    all_menu.add(orders[j]);
                    order_map.put(course_cnt,all_menu);
                }
            }
        }

        System.out.println(order_map);

        String menu ;
        String compare;

        ArrayList<String> answer_list = new ArrayList<String>();

        int cnt = 0;
        int max = -100;

        for(int i = 0; i < course.length; i++){

            course_cnt = order_map.get(course[i]).size();
            if(course_cnt >= 2){

                for(int j = 0 ; j < course_cnt; j++){

                    compare = order_map.get(course[i]).get(j);

                    for(int k = 0 ; k < compare.length(); k++){

                        for(int l = k + 1; l < compare.length(); l++){

                            menu = compare.charAt(k) + ""+ compare.charAt(l);
                            System.out.println(menu);

                            for(int m = 0 ; m < course_cnt; m++){

                                if(order_map.get(course[i]).get(m).contains(menu)){
                                    cnt++;
                                }

                            }

                            if(cnt > max){
                                System.out.println(menu  + "  : " + cnt);
                                max = cnt;
                                cnt = 0;
                            }
                        }

                    }

                }
            }

        }




        String[] answer = {};
        return answer;
    }
}
