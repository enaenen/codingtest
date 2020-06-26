// https://www.acmicpc.net/problem/12865
package jooeun.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_12865 {

    static int n;
    static int k;
    static Product[] products;
    static int max_V;

    public static void main(String[] args) throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        products = new Product[n];

        for(int i = 0 ; i < n ; i++) {

            st = new StringTokenizer(br.readLine());
            products[i] = new Product(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));

        }

        System.out.println(max_V);

    }

//    static void dfs(int idx,int sum_w,int sum_v){
//
//        if(sum_w )
//
//    }


}

class Product{

    protected int w;
    protected int v;

    public Product(){;}

    public Product(int w, int v){
        this.w = w;
        this.v = v;
    }

}
