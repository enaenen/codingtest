package space.codingtest.devmaching;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class One {
        public static String solution(String p, int n) {
            String answer = null;
            String startDate="20201010"+"000000";
            String[] ary = p.split(" ");
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            cal.setTime(date);
            if(ary[0].equals("PM")){}

            return answer;
        }

    public static void main(String[] args) {
        solution("PM 01:00:00",10);
    }
}
