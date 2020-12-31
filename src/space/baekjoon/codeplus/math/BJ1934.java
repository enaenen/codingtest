package space.baekjoon.codeplus.math;


import java.io.*;
import java.util.StringTokenizer;

public class BJ1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNum = Integer.parseInt(br.readLine());
        while(caseNum -->0){
            StringTokenizer st= new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int answer=a*b;
            while(b!=0){
                int r= a%b;
                a=b;
                b=r;
            }
            bw.write(answer/a+"\n");
        }
        bw.flush();
    }
}
