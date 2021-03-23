package space.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InteliTrain2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int passenger=0;
        int max = -1;
        while(i < 10){
            String[] inputs = br.readLine().split(" ");
            passenger += (Integer.parseInt(inputs[1])-Integer.parseInt(inputs[0]));
            if(passenger>=max)
                max = passenger;
            i++;
        }
        System.out.println(max);
    }
}
