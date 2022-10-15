package space.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P2576 {
    public static void main(String[] args) throws IOException {
        List<Integer> oddNums = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 7; i++){
            int input = Integer.parseInt(br.readLine());
            if (input % 2 != 0)
                oddNums.add(input);
        }
        if(oddNums.size() == 0)
            System.out.println(-1);
        else {
            System.out.println(oddNums.stream().mapToInt(Integer::intValue).sum());
            System.out.println(Collections.min(oddNums));
        }
    }
}
