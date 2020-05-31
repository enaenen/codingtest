package space.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Travel {
    private static ArrayList<String> answerList = new ArrayList<String>();
    private static String route="";
    static boolean[] visited;

    public static void main(String[] args){
        String[][] tickets = new String[][] {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        String[] answer = solution(tickets);
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }

    }
    public static String[] solution(String[][] tickets){
        String[] answer = {};
        for(int i=0;i<tickets.length;i++){
            visited = new boolean[tickets.length];
            String start = tickets[i][0];
            String destination = tickets[i][1];

            if(start.equals("ICN")){
                route = start + ",";
                visited[i]=true;
                dfs(tickets, destination, 1);
            }
        }
        Collections.sort(answerList);
        answer = answerList.get(0).split(",");
        return answer;
    }
    private static void dfs(String[][] tickets, String end, int cnt){
        route += end+",";
        if(cnt==tickets.length){
            answerList.add(route);
            return;
        }
        for(int i=0;i<tickets.length;i++){
            String start = tickets[i][0];
            String destination = tickets[i][1];
            if(start.equals(end) && !visited[i]){
                visited[i]=true;
                dfs(tickets, destination, cnt + 1);
                visited[i]=false;
                route = route.substring(0, route.length()-4);
            }
        }
    }
}
