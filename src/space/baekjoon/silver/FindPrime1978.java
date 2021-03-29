package space.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPrime1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int counter=0;
        for (int i =0;i<cases;i++){
            int n=Integer.parseInt(inputs[i]);
            if(n==3 || n==2)
                counter++;
            for(int j=2; j*j<=n;j++){
                if(j%n!=0)
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
