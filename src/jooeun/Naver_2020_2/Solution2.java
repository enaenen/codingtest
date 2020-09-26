package jooeun.Naver_2020_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution2 {

    public static void main(String[] args){

        int n = 9;
        int[][] edges = {{0,2},{2,1},{2,4},{3,5},{5,4},{5,7},{7,6},{6,8}};

        int[] result =  solution(n, edges);

        for(int i : result){
            System.out.print(i + "   ");
        }
    }

    public static int[] solution(int n, int[][] edges){

        int[] result = new int[2];

        HashMap<Integer, ArrayList<Integer>> e_map = new HashMap<Integer, ArrayList<Integer>>();

        ArrayList<Integer> temp;
        int node_1;
        int node_2;

        for(int i = 0 ; i < edges.length ; i++){

            node_1 = edges[i][0];
            node_2 = edges[i][1];

            temp = e_map.get(node_1);
            if(temp == null)
                temp = new ArrayList<Integer>();
            temp.add(node_2);

            e_map.put(node_1,temp);

            temp = e_map.get(node_2);
            if(temp == null)
                temp = new ArrayList<Integer>();
            temp.add(node_1);

            e_map.put(node_2,temp);
        }

        System.out.println(e_map);

        int[][] nodes = {{-1,-1},{-1,-1}};
        int row = 0;

        for(int i = 0 ; i < n; i++){

            temp = e_map.get(i);

            if(temp.size() > 2){
                for(int j = 0 ; j < temp.size() ; j++){

                    node_2 = temp.get(j);

                    if(e_map.get(node_2).size() > 1 && node_2!= i){
                        nodes[row][0] = i;
                        nodes[row][1] = node_2;
                        row++;

                        temp.remove(j);
                    }
                }
            }
        }

        System.out.println(e_map);

        for(int i = 0 ; i < 2; i++){

            for(int j = 0 ; j < edges.length ; j++) {
                if (nodes[i][0] == edges[j][0]) {
                    if (nodes[i][1] == edges[j][1]) {
                        result[i] = j;
                    }
                }
            }
        }

        return result;
    }
}
