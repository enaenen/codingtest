package space.codingtest.startupcodingfestival;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
// 창국이코드 - 통과 1단계
public class P1ck {
    static List<Integer> starts = new ArrayList<>();
    static List<Integer> ends = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);
        for(int i =0; i<n;i++)
        {
            String line = br.readLine();
            String[] startToEnd = line.split(" ~ ");
            String s = startToEnd[0];
            String e = startToEnd[1];

            int startNum = stringToInt(s);
            starts.add(startNum);
            int endNum = stringToInt(e);
            ends.add(endNum);
        }
        int maxStart = -1;
        int minEnd = 1440;
        for(int i=0; i<starts.size(); i++){
            if(maxStart < starts.get(i)){
                maxStart = starts.get(i);
            }
        }
        for(int i=0; i<ends.size(); i++){
            if(minEnd > ends.get(i)){
                minEnd = ends.get(i);
            }
        }
        if(maxStart >= minEnd){
            System.out.println(-1);
            return;
        }
        printAnswer(maxStart, minEnd);
    }

    private static void printAnswer(int start, int end){
        int startHour = start/60;
        int startMin = start -(startHour * 60);

        int endHour = end/60;
        int endMin = end -(endHour * 60);

        String startStr = startHour + ":" + startMin;
        String endStr= endHour + ":" + endMin;

        if(startMin < 10){
            startStr = startHour + ":" +"0" + startMin;
        }
        if(endMin < 10){
            endStr = endHour + ":" +"0" + endMin;
        }
        if(startHour<10) startStr = "0"+startStr;
        if(endHour<10) endStr = "0"+endStr;

        System.out.println(startStr + " ~ " + endStr);

    }
    private static int stringToInt(String str)
    {
        String[] time = str.split(":");
        int timeNum = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
        return timeNum;
    }
}
