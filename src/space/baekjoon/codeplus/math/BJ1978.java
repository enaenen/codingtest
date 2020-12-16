package space.baekjoon.codeplus.math;

import java.io.*;
import java.util.StringTokenizer;

public class BJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());
        int answer= 0;
        StringTokenizer st= new StringTokenizer(br.readLine()," ");
        while(st.hasMoreTokens()) {
            if(prime(Integer.parseInt(st.nextToken()))) answer++;
        }
        bw.write(answer+"");
        bw.flush();
    }
    public static boolean prime(int n){
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
