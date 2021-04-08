package space.codingtest.startupcodingfestival;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        int startHour=-1;
        int startMin=-1;

        int endHour=100;
        int endMin=100;
        ArrayList<Integer> startHours = new ArrayList<>();
        ArrayList<Integer> startMinutes = new ArrayList<>();

        ArrayList<Integer> endHours = new ArrayList<>();
        ArrayList<Integer> endMinutes = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String oneLine = br.readLine().trim();
            String[] times = oneLine.split("~");
            String[] startTime = times[0].split(":");
            String[] endTime = times[1].split(":");
            int comingHour = convertTimeToInt(startTime[0].trim());
            startHours.add(comingHour);
            int comingMinute = convertTimeToInt(startTime[1].trim());
            startMinutes.add(comingMinute);

            if(startHour < comingHour) {
                startHour = comingHour;
                startMin = comingMinute;
            }
            else if (startHour == comingHour) {
                if(startMin <= comingMinute)
                    startMin = comingMinute;
            }

            int afterHour = convertTimeToInt(endTime[0].trim());
            endHours.add(afterHour);
            int afterMinute = convertTimeToInt(endTime[1].trim());
            endMinutes.add(afterMinute);

            if(endHour > afterHour){
                endHour = afterHour;
                endMin = afterMinute;
            }
            else if(endHour == afterHour){
                if(endMin >= afterMinute)
                    endMin = afterMinute;
            }
        }
        for(int i=0;i<endHours.size();i++) {
            if(endHours.get(i) < startHour) {
                System.out.println("-1");
                return;
            }
            else if(endHours.get(i) == startHour)
            {
                if(endHours.get(i) < startMin) {
                    System.out.println("-1");
                    return;
                }
            }
        }
        String outputMaxHour = convertTimeToString(startHour);
        String outputMaxMin = convertTimeToString(startMin);
        String outputMinHour = convertTimeToString(endHour);
        String outputMinMin = convertTimeToString(endMin);
        System.out.println(outputMaxHour+":"+outputMaxMin + " ~ " +outputMinHour+":"+outputMinMin);
    }
    public static int convertTimeToInt(String time) {
        if(time.equals("00"))
            return 0;
        else
            return Integer.parseInt(time);
    }
    public static String convertTimeToString(int time){
        int isPM = time / 10;
        if(time==0)
            return "00";
        else if(isPM == 1 || isPM == 2)
            return ""+isPM+(time%10);
        else
            return ""+time;
    }
}