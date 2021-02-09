package space;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

public class StringTest {
    public static void main(String[] args) {
        String test1 = "https://k.kakaocdn.net/dn/SQIUi/btqNJwpNcc8/oz5IZh3P8916IznsSWsBkK/img_640x640.jpg";
        System.out.println(test1.contains("kakaocdn.net"));
        System.out.println(TimeZone.getTimeZone("Asia/Seoul"));
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Tokyo");
        System.out.println(timeZone);
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Tokyo"));
        System.out.println(LocalDateTime.now());
        System.out.println();
        System.out.println();
        System.out.println();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");


        System.out.println(sdf.format(date.getTime()));

    }
}
