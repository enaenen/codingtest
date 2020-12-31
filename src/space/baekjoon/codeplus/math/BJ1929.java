package space.baekjoon.codeplus.math;

import java.io.*;
import java.util.StringTokenizer;

public class BJ1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st= new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] primeNumbers = new int[b-a+1];
        int primeCounter=0;
        boolean[] check = new boolean[b+1];
        for(int i=a; i<=b; i++){
            if(i<2 || i%2==0 ) continue;
            if(check[i]==false) primeNumbers[primeCounter++]=i;
            for(int j=i*2;j<=b;j+=i){
                check[j]=true;
            }
        }
        for (int primeNumber : primeNumbers) {
            if(primeNumber<=0) break;
            System.out.println(primeNumber);
        }
    }
}
