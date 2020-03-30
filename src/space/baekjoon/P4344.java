/*
    https://www.acmicpc.net/problem/4344

    입력
    TC 수

    학생 수 점수

    출력

    평균점수를 넘는 학생들의 비율
    평균을 넘은학생/전체학생 X 100


    필요한것
    학생수와 점수를 입력받는다
    점수를 다 더하여 평균을 구한다.
    평균을 넘는학생 수를 구하여 전체학생으로 나누어
 */
package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4344 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while(tc-->0){
            String[] inputArray = br.readLine().split(" ");
            int students = Integer.parseInt(inputArray[0]);
            int[] scoreArray = new int[students];
            for(int i=0;i<students;i++){
                scoreArray[i]=Integer.parseInt(inputArray[i+1]);
            }
            System.out.println(String.format("%.3f%%",solution(scoreArray,students)));
        }

    }
    public static double solution(int[] scores, int students){
        double average=0;
        for(int sum : scores){
            average += sum;
        }
        average/=students;

        double overAverage=0;

        for(int check : scores){
            if(check > average){
                overAverage++;
            }
        }
        return (overAverage/(double)students * 100);
    }
}
