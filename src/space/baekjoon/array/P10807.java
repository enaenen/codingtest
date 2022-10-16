package space.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class P10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        HashMap<Integer, Integer> map= new HashMap<Integer,Integer>();
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int answer = map.getOrDefault(Integer.parseInt(br.readLine()), 0);
        System.out.println(answer);
    }
}
