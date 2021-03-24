package space.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SolvingEZProblem1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int start = Integer.parseInt(inputs[0]);
        int end = Integer.parseInt(inputs[1]);
        ArrayList<Integer> list = new ArrayList();
        int i=1;
        while (i<=end){
            for(int j=0; j<i; j++){
                list.add(i);
            }
            i++;
        }
        int result=0;
        for(int j=start-1;j<end;j++){
           result+= list.get(j);
        }
        System.out.println(result);
    }
}
