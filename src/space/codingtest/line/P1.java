package space.codingtest.line;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class P1 {
    public static void main(String[] args) {

        String[] holidays1 = new String[] {"01/14","01/15","01/18","01/22","01/23","01/29","02/01","02/03","02/07"};
        int solution = solution(holidays1, 5);
        System.out.println("holidays1 = " + solution);
    }
    public static int solution(String[] holidays, int k) {

        int answer = -1;

        LocalDateTime date = LocalDateTime.of(2021,01,02,00,00,00);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd");
        int counter=0;
        Set<Integer> holidaySet = new HashSet<>();

        while(!date.equals(LocalDateTime.of(2022,01,01,00,00,00))){
            date=date.plusDays(1L);
            String dayOfWeek = date.getDayOfWeek().toString();
            if(dayOfWeek.equals("SATURDAY")|| dayOfWeek.equals("SUNDAY")) {
                counter++;
                continue;
            }
            if(Arrays.asList(holidays).contains(date.format(formatter))){
                counter++;
                continue;
            }
            if(counter!=0) {
                holidaySet.add(counter);
            }
            counter=0;
        }

        List<Integer> holidayList = holidaySet.stream().collect(Collectors.toList());
        Collections.sort(holidayList,Collections.reverseOrder());

        for (Integer integer : holidayList) {
            System.out.println("integer = " + integer);
        }
        answer=holidayList.get(k-1);

        return answer;
    }
}
