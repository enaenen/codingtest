package space.study.week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PresentValue2592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int average = 0;
        for (int i = 0; i < 10; i++) {
            String number = br.readLine();
            map.put(number, map.getOrDefault(number, 0) + 1);
            average += Integer.parseInt(number);
        }
        System.out.println(average/10);
        int maxValueInMap = Collections.max(map.values());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()==maxValueInMap)
                System.out.println(entry.getKey());
        }
    }
}
