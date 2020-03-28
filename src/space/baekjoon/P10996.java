package space.baekjoon;


/*

https://www.acmicpc.net/problem/10996

입력 n

출력
n개의 개수만큼의 별


1보다 무조건 큰값을 입력하므로 *를 찍고 시작
" *" 를 n-1개 찍는다고 생각
[
    첫째줄에
    n-1/2
    ==============
    둘재줄에
    n/2
]
이렇게 묶어서 n개를 찍는다.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class P10996 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        //전체
        for (int i = 0; i < n; i++) {
            //첫번째 줄 (n-1) / 2 개
            out.write("*");
            for (int k = 0; k < (n - 1) / 2; k++) {
                out.write(" *");
            }
            //두번째 줄 n / 2 개
            out.write("\n");
            for (int k = 0; k < n / 2; k++) {
                out.write(" *");
            }
            out.write("\n");
        }
        out.flush();
    }
}
