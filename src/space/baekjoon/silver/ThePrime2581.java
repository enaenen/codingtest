package space.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThePrime2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[b+1];
        check[0]=true;
        check[1]=true;

        for(int i=2; i*i<=b; i++){
            if(check[i])
                continue;
            for(int j=i+i; j<=b; j+=i)
                check[j]=true;
        }
        int min = -1;
        int result = 0;
        for(int i=a;i<=b;i++){
            if(!check[i]) {
                if (min==-1)
                    min=i;
                result += i;
            }
        }
        if(result==0)
            System.out.println(-1);
        else {
            System.out.println(result);
            System.out.println(min);
        }
    }
}
