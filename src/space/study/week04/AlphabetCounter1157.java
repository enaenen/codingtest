package space.study.week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AlphabetCounter1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toUpperCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        char answer ='\0';
        for (char alphabet : word)
            map.put(alphabet, map.getOrDefault(alphabet, 0) + 1);
        Integer maxValue = Collections.max(map.values());
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (maxValue == entry.getValue()) {
                if(answer!='\0')
                    answer = '?';
                else
                    answer = entry.getKey();
            }
        }
        System.out.println(answer);
    }
}
