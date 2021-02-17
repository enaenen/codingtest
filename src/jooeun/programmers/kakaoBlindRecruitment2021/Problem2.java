package jooeun.programmers.kakaoBlindRecruitment2021;

// https://programmers.co.kr/learn/courses/30/lessons/72411 -> 메뉴 리뉴얼

import java.util.*;

public class Problem2 {

    static int menu_num;
    static List<Menu> pick_list;
    static List<Menu> menuList;

    public static void main(String[] args){
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
//        String[] orders = {"XYZ", "XWY", "WXA"};
//        String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
        int[] course = {2,3,4};

        String[] answer = solution(orders, course);

    }

    public static String[] solution(String[] orders, int[] course){
        String[] answer;

        // 알파벳 개수만큼 메뉴 개수를 만듬
        int[] menu_ary = new int[26];

        // 각 매뉴의 총 주문 수 저장
        for(int i = 0 ; i < orders.length; i++){

            for(int j = 0 ; j < orders[i].length(); j++){
                menu_ary[orders[i].charAt(j) - 'A']++;
            }

        }

        // menu 클래스 list 만들기
        menuList = new ArrayList<Menu>();
        for(int i = 0 ; i < menu_ary.length; i++){
            if(menu_ary[i] > 1){
                menuList.add(new Menu((char)(i + 'A'), menu_ary[i]));
            }
        }

        menu_num = menuList.size();
        pick_list = new ArrayList<Menu>();

        int[] is_contain = new int[menuList.size()];
        List<String> answer_list = new ArrayList<String>();
        int menu_max = Integer.MIN_VALUE;

        for(String s : orders){

            if(menu_max < s.length()){
                menu_max = s.length();
            }

        }

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < course.length; i++){

            if(menu_max < course[i]){
                continue;
            }

            // 원하는 메뉴의 개수만큼 조합 -> 조합 리스트에 넣기
            pick(0, course[i], 0, is_contain);

            if(pick_list.size() != 0){

                for(int j = 0 ; j < pick_list.size(); j++){

                    for(int k = 0 ; k < orders.length; k++){

                        if(check(pick_list.get(j).menu_name, orders[k])){
                            pick_list.get(j).menu_cnt++;
                        }
                    }
                }

                pick_list.removeIf(menu -> menu.menu_cnt == 0);

                //고른 리스트 주문수에 따라 오름 차순으로 정렬
                Collections.sort(pick_list, Menu::compareTo);
                System.out.println(pick_list);
                max = pick_list.get(0).menu_cnt;

                if(max == 1){
                    continue;
                }

                for(int j = 0; j < pick_list.size(); j++){

                    if(max == pick_list.get(j).menu_cnt){
                        answer_list.add(pick_list.get(j).menu_name);
                    }else{
                        break;
                    }
                }
            }

            //초기화
            Arrays.fill(is_contain, 0);
            pick_list.clear();
        }

        Collections.sort(answer_list);
        System.out.println(answer_list);

        answer = new String[answer_list.size()];

        for(int i = 0 ; i < answer_list.size(); i++){
            answer[i] = answer_list.get(i);
        }

        return answer;
    }

    // 조합한 코스가 주문한 메뉴에 들어가 있는지 체크하는 함수
    public static boolean check(String menu_name, String order){

        boolean flag = false;

        char[] menu_char = menu_name.toCharArray();

        for(char c : menu_char){

            if(order.contains(c + "")){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }

        return flag;
    }

    // 각각의 주문에서 주문 수가 2개 이상 나옴 메뉴를 조합하는 함수
    public static void pick(int idx, int course, int pick_cnt, int[] is_contain){

        if(pick_cnt == course){

            String menu = "";
            for(int i = 0 ; i < menu_num; i++){

                if(is_contain[i] == 1){
                    menu += menuList.get(i).menu_name;
                }

            }

            pick_list.add(new Menu(menu, 0));

            return ;
        }

        if(idx >= menu_num){
            return;
        }

        is_contain[idx] = 1;
        pick(idx + 1, course, pick_cnt + 1, is_contain);

        is_contain[idx] = 0;
        pick(idx + 1, course, pick_cnt, is_contain);

    }
}

class Menu implements Comparable<Menu>{
    String menu_name;
    int menu_cnt;

    public Menu(){}

    public Menu(String menu_name, int menu_cnt){
        this.menu_cnt = menu_cnt;
        this.menu_name = menu_name;
    }

    public Menu(char menu_name, int menu_cnt){
        this.menu_name = menu_name + "";
        this.menu_cnt = menu_cnt;
    }

    public String toString(){
        return "menu name : " + this.menu_name + ", menu cnt : " + this.menu_cnt + "////\n";
    }


    @Override
    public int compareTo(Menu o) {
        //플레이 횟수에 대해서는 오름차순
        if(this.menu_cnt < o.menu_cnt){
            return 1;
        }

        return -1;
    }
}
