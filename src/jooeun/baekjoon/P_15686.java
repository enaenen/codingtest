package jooeun.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P_15686 {

    static int n;
    static int m;
    static int map[][];
    static int result = Integer.MAX_VALUE;
    static ArrayList<int[]> house;
    static ArrayList<int[]> store;
    static boolean[] check;


    //0 :  빈칸, 1 : 집, 2 : 치킨집
    public static void main(String[] args) throws IOException {

        house = new ArrayList<int[]>();
        store = new ArrayList<int[]>();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine());
//        map = new int[n][n];
//
//        for(int i = 0 ; i < n ; i++){
//            for(int j = 0 ;  j < n ; j++){
//                map[i][j] = Integer.parseInt(st.nextToken());
//
//                //치킨집, 좌표 뽑기
//                if(map[i][j] == 1)
//                    house.add(new int[]{i,j});
//                else if(map[i][j] == 2)
//                    store.add(new int[]{i,j});
//
//            }
//        }

        n = 5;
        m = 1;
        map = new int[][]{{1, 2, 0, 0, 0},{1, 2, 0, 0, 0},{1, 2, 0, 0, 0},{ 1, 2, 0, 0, 0},{1, 2, 0, 0, 0}};

        //result = 11;

        for(int i = 0 ; i <n ; i++){
            for(int j = 0; j <n; j++){
                if(map[i][j] == 1){
                    house.add(new int[]{i,j});
                }else if(map[i][j] == 2){
                    store.add(new int[]{i,j});
                }
            }
        }
        check = new boolean[store.size()];

        dfs(0,0);
        System.out.println(result);
    }

    static public void dfs(int cnt, int index) {

        if(index == store.size()){
            return;
        }

        //치킨집  m개가 다 뽑힌 후
        if(cnt == m){

            int sum = 0;
            int dist = Integer.MAX_VALUE;

            //집과 치킨집과의 치킨거리 구하기
            for(int i = 0 ; i < house.size(); i++){

                for(int j = 0 ; j < store.size() ; j++){

                    if(check[j] ){
                        dist = Math.abs(house.get(i)[0] - store.get(j)[0]) + Math.abs(house.get(i)[1] - store.get(j)[1]);
                    }
                }
                //합계에 최소 거리 더하기
                sum += dist;
            }

            if(result > sum){
                result = sum;
            }

            return;

        }

        //치킨집 랜덤으로 m개 뽑기

        dfs(cnt,index+1);
        check[index] =  true;

        dfs(cnt+1, index+1);
        check[index] = false;

    }

}
