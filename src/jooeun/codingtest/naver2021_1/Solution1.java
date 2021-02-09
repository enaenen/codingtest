package jooeun.codingtest.naver2021_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution1 {

    public static void  main(String[] args){

        String[] holidays = {"01/14" ,"01/15", "01/18", "01/22","01/23","01/29","02/01","02/03","02/07"};
        int k = 1;

        System.out.println(solution(holidays, k));

    }

    public static int solution(String[] holidays ,int k){

        int answer = 0;
        List<Days> h_days = new ArrayList<Days>();

        //holidays Days 클래스로 만듬.
        String[] ary = new String[2];
        for(int i = 0 ; i < holidays.length; i++){

            ary = holidays[i].split("/");
            h_days.add(new Days(Integer.parseInt(ary[0]),Integer.parseInt(ary[1])));

        }

        //요일 계산하여 저장
        // 0 : 월 ~ 6 : 일
        int d_sum = 0;
        for(int i = 0 ; i <  h_days.size(); i++){

            d_sum = 0;

            //해당하는 월만큼 돈다
            //1월 1일은 금요일, 6
            for(int m = 1 ; m <  h_days.get(i).month; m++){

                if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){

                    d_sum += 31;

                }else if(m == 4 || m == 6 || m == 9 || m == 11){

                    d_sum += 30;

                }else if(m == 2){

                    d_sum += 28;

                }

            }

            d_sum +=  h_days.get(i).day;
            h_days.get(i).dayOfTheWeek = (d_sum+3) % 7 ;

        }

        // 날짜순으로 정렬되어있으니까
        // h_days 돌면서 앞뒤로 휴일이 있는지 체크
        // 공휴일 : 5(토), 6(일) -> 현재 날짜가 4(금), 5(토), 6(일), 0(월)
        // ->
        List<Integer> h_len = new ArrayList<>();
        Days d = null;
        boolean is_h = true;
        Days next_day = null;
        Days before_day = null;

        int i = 0;
        while(i < h_days.size()){

            d = h_days.get(i);
            d_sum = 1;

            is_h = true;

            //전날 객체 만들기
            if(d.day == 1){
                if(d.month == 2 || d.month == 4 || d.month == 6 || d.month == 9 || d.month == 11){
                    before_day = new Days(d.month - 1, 31, (d.dayOfTheWeek + 6)%7);
                }else if(d.month == 1){
                    before_day = new Days(12, 31, (d.dayOfTheWeek + 6)%7);
                }else if(d.month == 3){
                    before_day = new Days(d.month - 1, 28, (d.dayOfTheWeek + 6)%7);
                }else{
                    before_day = new Days(d.month - 1, 30, (d.dayOfTheWeek + 6)%7);
                }
            }else{
                before_day = new Days(d.month, d.day - 1, (d.dayOfTheWeek + 6)%7);
            }

//            System.out.println("BEFORE : " + before_day);

            if(before_day.dayOfTheWeek == 5 || before_day.dayOfTheWeek == 6){
                d_sum++;
            }

            while(is_h){

//                System.out.println("Today : " + d);

                //다음날 객체 만들기
                if(d.day == 31){

                    next_day = new Days(d.month + 1, 1, (d.dayOfTheWeek + 1)%7);

                }else if((d.day == 30) && (d.month == 4 || d.month == 6 || d.month == 9 || d.month == 11)){

                    next_day = new Days(d.month + 1, 1, (d.dayOfTheWeek + 1)%7);

                }else if(d.day == 28 && d.month == 2){

                    next_day = new Days(d.month + 1, 1, (d.dayOfTheWeek + 1)%7);

                }else{
                    next_day = new Days(d.month, d.day + 1, (d.dayOfTheWeek + 1)%7);
                }

//                System.out.println("NEXT : " + next_day);

                //다음날이 공휴일이 아닌 휴일인 경우
                i++;
                if(i >= h_days.size()){
//                    System.out.println("총 휴일 수 : " + d_sum);
                    is_h = false;
                }else{

//                    System.out.println("i++ ; " + h_days.get(i));
                    if(next_day.month == h_days.get(i).month && next_day.day == h_days.get(i).day){
                        is_h = true;
                        d_sum++;

                    }else{

                        //다음날이 토요일, 일요일우 경우
                        if(next_day.dayOfTheWeek == 5 || next_day.dayOfTheWeek == 6){
                            --i;
                            is_h = true;
                            d_sum++;

                        }else{
//                            System.out.println("총 휴일 수 : " + d_sum);
                            is_h = false;
                        }

                    }

                }


                d = next_day;

            }

            h_len.add(d_sum);

        }

        // 내림차순으로 정렬
        h_len.sort(Comparator.reverseOrder());
        answer = h_len.get(k-1);

//        System.out.println(h_len);

        return answer;
    }

}

class Days{

    int month;

    int day;

    // 0 : 월 ~ 6 : 일
    int dayOfTheWeek;

    public Days(){}

    public Days(int month, int day){

        this.month = month;
        this.day = day;

    }

    public Days(int month, int day, int dayOfTheWeek){

        this.month = month;
        this.day = day;
        this.dayOfTheWeek = dayOfTheWeek;

    }

    public String toString(){
        return month +" 월 " + day + "일 " + dayOfTheWeek + "요일";
    }

}
