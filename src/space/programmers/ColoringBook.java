package space.programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ColoringBook {
    private static int[][] map;
    private static boolean[][] check;
    private static HashMap<Integer,Integer> sizes;
    private static int areas;
    private static int[][] findLocation = {{0,1},{-1,0},{1,0},{0,-1}};
    public static void main(String[] args){
        int[][] pic= {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,3},{0,0,0,3}};
        System.out.println(solution(6,4,pic));
    }
    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        map = new int[m][n];
        check = new boolean[m][n];
        System.out.println(check.length);
        System.out.println(check[0].length);
        sizes = new HashMap<Integer,Integer>();
        for(int i=0;i<picture.length;i++){
            for(int j=0;j<picture[0].length;j++){
                map[i][j]=picture[i][j];
            }
        }
        int[] answer = new int[2];
        dfs(0,0,1,0);
//        if(maxSizeOfOneArea<nowArea){
//            maxSizeOfOneArea=nowArea;
//            nowArea=0;
//        }
        for(int i : sizes.values()){
            System.out.println(i);
        }
        answer[0] = numberOfArea = areas;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    public static void dfs(int y, int x, int areaNum, int num){
        if(y>=check.length||x>=check[0].length || check[y][x]){//영역 바깥 탈락
            return;
        }
        if(map[y][x]!=areaNum&&map[y][x]!=0){//다른영역발견시
            areas++;
            dfs(x,y,areaNum,num++);
        }
        else {
            sizes.put(num,sizes.getOrDefault(num,0)+1);
            check[y][x] = true;
            for (int i = 0; i < 4; i++) {
                dfs(y + findLocation[i][0], x + findLocation[i][1], areaNum,num);
            }
        }
    }
}
