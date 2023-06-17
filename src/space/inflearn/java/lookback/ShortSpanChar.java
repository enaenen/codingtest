package space.inflearn.java.lookback;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortSpanChar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        char[] charArray = input[0].toCharArray();
        int[] answer = new int[charArray.length];
        char c = input[1].charAt(0);
        int index = 0;
        int current = 0;
        int count = 0;
        while (current < answer.length){
            if(answer[index] == c){
                answer[current++] = count;
                count = 0;
            }
            else {
                ++count;
            }
            index++;
        }
        for (int i : answer) {
            System.out.print(i + " ");
        }

    }
}
