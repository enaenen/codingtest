package space.studyin42.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AscendingStudent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i =0; i < n; i++){
            String input = br.readLine();
            map.put(input.substring(0,4), Integer.parseInt(input.substring(4)));
        }
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " ");
        }
    }
}
