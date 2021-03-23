package space.programmers;


import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Year2016 {
    public static void main(String[] args) throws ParseException {
        String solution = solution(5, 24);
        System.out.println(solution);
    }
    public static String solution(int a, int b) throws ParseException {
        LocalDate date = LocalDate.of(2016,a,b);
        String answer = date.format(DateTimeFormatter.ofPattern("E").withLocale(Locale.ENGLISH));
        return answer.toUpperCase();
    }
}
