package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4344_re {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        while(tc-->0) {
            StringTokenizer st;
            st = new StringTokenizer(br.readLine());
            int students =Integer.parseInt(st.nextToken());
            int[] scoreArray = new int[students];
            int average=0;

            for(int i=0;i<students;i++){
                scoreArray[i]=Integer.parseInt(st.nextToken());
                average+=scoreArray[i];
            }
            average/=students;
            int overAverage=0;
            for(int studentScore : scoreArray){
                if(studentScore>average){
                    overAverage++;
                }
            }
            double result = (double)overAverage/students*100;

            System.out.printf("%.3f",result);
            System.out.print("%");
            System.out.println();
        }
    }
}
