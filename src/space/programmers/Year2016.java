package space.programmers;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Year2016 {
    public static void main(String[] args) throws ParseException {
        String solution = solution(5, 24);
        System.out.println(solution);
    }
    public static String solution(int a, int b) throws ParseException {
        String answer = "";
        String md;
        if(a<10) {
            md="0"+a;
        }else{
//            md=a+b;
        }
        String inputDate="2016"+"0"+a+b;
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Date date = df.parse(inputDate);

        return answer.toUpperCase();
    }
}
