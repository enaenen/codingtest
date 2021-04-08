package space.codingtest.startupcodingfestival;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExamTest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] oneLine = input.split(" ");
        int n = Integer.parseInt(oneLine[0]);
        int k = Integer.parseInt(oneLine[1]);

        input = br.readLine();
        oneLine= input.split(" ");

        int[] answer = new int[n];
        for(int i=0;i<n;i++) {
            answer[i] = Integer.parseInt(oneLine[i]);
        }



        //System.out.println("Hello Goorm! Your input is " + input);
    }
}
