package jooeun.codingtest.스타트업코딩페스티벌2021;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1 {

    public static void main(String[] args){

        int n = 3;
        String[] ary = {"12:00 ~ 23:59", "11:00 ~ 18:00", "14:00 ~ 20:00"};

        String answer = solution(n, ary);
        System.out.println(answer);
    }

    public static String solution(int n, String[] ary){

        StringBuilder sb = new StringBuilder();
        Time[][] time = new Time[2][n];
        String[] temp;

        for(int i = 0 ; i < n ; i++){

            // 공백 제거 및 ~ 제거
            ary[i] = ary[i].replaceAll(" ", "");
            temp = ary[i].split("~");

            time[0][i] = new Time(temp[0]);
            time[1][i] = new Time(temp[1]);
        }

        for(int i = 0; i < 2; i++){
            Arrays.sort(time[i], new Comparator<Time>() {
                @Override
                public int compare(Time o1, Time o2) {
                    return o1.compareTo(o2);
                }
            });
        }

        if(time[0][n-1].compareTo(time[1][0]) == 1)   // return -1
            return "-1";
        else    // return 형식 : 14:00 ~ 18:00
            return time[0][n-1] + " ~ " + time[1][0];
    }

}

class Time implements Comparable<Time>{

    int hour;
    String minute;

    public Time(){}

    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute + "";
    }

    public Time(String time){
        String[] ary = time.split(":");

        this.hour = Integer.parseInt(ary[0]);
        this.minute = ary[1];
    }

    public String toString(){
        return this.hour + ":" + this.minute;
    }

    public int compareTo(Time t){

        //hour 이 작으면 작음
        if(this.hour > t.hour) {
            return 1;
        }else if(this.hour == t.hour){

            int this_minute;
            int t_minute;

            if(this.minute.equals("00"))
                this_minute = 0;
            else
                this_minute = Integer.parseInt(this.minute);

            if(t.minute.equals("00"))
                t_minute = 0;
            else
                t_minute = Integer.parseInt(t.minute);

            if(this_minute > t_minute)
                return 1;
        }

        return -1;
    }
}
