package space.baekjoon.codeplus.math;

/*
공식
GCD(A,B)
GCD(B, A%B)
*/


import java.io.*;

public class BJ2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int lcm = a*b;
        while(b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        bw.write(a+"\n");
        bw.write( lcm / a+"\n");
        bw.flush();
    }
}
