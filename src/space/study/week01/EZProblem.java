package space.study.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EZProblem {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int start = Integer.parseInt(inputs[0]);
        int end = Integer.parseInt(inputs[1]);
        int[] array = new int[end];
        int answer = 0;
        int index = 0;
        for(int i=0;i<end;i++){
            if(index==end)
                break;
            for(int j=0;j<i;j++){
                if(index==end)
                    break;
                array[index]=i;
                index++;
            }
        }
        for(int i=start-1;i<end-1;i++){
            answer+=array[i];
        }
        System.out.println(answer);
    }
}
