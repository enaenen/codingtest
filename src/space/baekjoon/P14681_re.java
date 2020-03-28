package space.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14681_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        System.out.println(solution(x,y));

    }
    private static int solution(int x, int y){
        if(x*y > 0)
            if(x<0) return 3;
            else return 1;
        else{
            if(x>0) return 4;
            else return 2;
        }
    }
}
