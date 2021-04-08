package space;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        LocalDateTime localDateTime = LocalDateTime.now();
        int dayOfMonth = localDateTime.toLocalDate().with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
//        localDateTime=localDateTime.plusDays(18);
        System.out.println(localDateTime);

        if(localDateTime.getDayOfMonth()==dayOfMonth){
            System.out.println("true");
            localDateTime=localDateTime.plusMonths(1);
            cal.set(localDateTime.getYear(), localDateTime.getMonthValue()-1, localDateTime.toLocalDate().with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth(),
                    localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
        }else{
            cal.set(localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth(),
                    localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
        }
        Date d1 = cal.getTime();
        System.out.println(d1);
    }
}
