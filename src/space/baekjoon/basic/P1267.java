package space.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
start = 10 or 15

youngsik = 0 ~ 29 => 10
start + 10;

minsik = 0 ~59 => 15
start + 15
 */
public class P1267 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int[] calls = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int yongsik = 0;
        int minsik = 0;
        for (int oneCall : calls) {
            yongsik += 10 + oneCall / 30 * 10;
            minsik += 15 + oneCall / 60 * 15;
        }

        if (yongsik < minsik)
            System.out.println("Y " + yongsik);
        else if (minsik < yongsik)
            System.out.println("M " + minsik);
        else
            System.out.println("Y M " + yongsik);
    }
}
