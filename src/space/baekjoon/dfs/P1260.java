package space.baekjoon.dfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P1260 {
    private static int[][] map;
    private static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int node = Integer.parseInt(input[0]);
        int edge = Integer.parseInt(input[1]);
        visited = new boolean[node+1];
        int startNum = Integer.parseInt(input[2]);

        map = new int[node+1][node+1];
        for(int i=1;i<=edge;i++){
            String[] nodes =br.readLine().split(" ");
            map[Integer.parseInt(nodes[0])][Integer.parseInt(nodes[1])]=1;
            map[Integer.parseInt(nodes[1])][Integer.parseInt(nodes[0])]=1;
        }

        //DFS
        dfs(startNum);
        //리셋
        for(int i=0;i<visited.length;i++){
            visited[i]=false;
        }
        System.out.println();
        //BFS
        bfs(startNum);

    }
    //재귀함수
    private static void dfs(int num){
        visited[num]=true;//Visited 배열 초기화
        System.out.print(num + " "); //출력
        for(int i=1;i<=map.length-1;i++){
            if(map[num][i]==1 && !visited[i]){//i숫자의 노드가 방문되지않았고, 현재 num과 연결되어있는 노드라면 재귀
                dfs(i);
            }
        }
    }

    private static void bfs(int num){
        Queue<Integer> queue = new LinkedList<Integer>();
        //1.큐에 숫자 넣고, 방문 체크
        queue.add(num);
        visited[num]=true;

        while(!queue.isEmpty()){
            //큐에서 처음넣은 숫자를 빼고 출력
            num = queue.poll();
            System.out.print(num+" ");
            //처음넣은숫자와 연결되어있고, 방문하지않은 노드 찾기
            for(int i=1;i<=map.length-1;i++){
                if(map[num][i]==1 && !visited[i]){
                    //방문되지않았다면 큐에 추가하고 방문 기록
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }

    }
}
