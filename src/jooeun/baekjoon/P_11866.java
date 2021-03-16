package jooeun.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P_11866 {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder(solution(n, k).toString());

        sb.replace(0,1,"<");
        sb.replace(sb.length() -1 ,sb.length(),">");

        System.out.println(sb);
    }

    public static List<Integer> solution(int n, int k){

        if(n <= 0 || k <= 0)
            return null;

        List<Integer> answer = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1 ; i <= n; i++ )
            list.add(i);

        int list_idx = 0;
        int cnt = 1;

        while(list.size() > 0){

            if(cnt == k){

                answer.add(list.get(list_idx));
                cnt = 1;

                if(list_idx == list.size() - 1) {
                    list.remove(list_idx);
                    list_idx = 0;
                }else
                    list.remove(list_idx);
            }else{

                if(list_idx == list.size() - 1)
                    list_idx = 0;
                else
                    list_idx++;

                cnt++;
            }
        }
        return answer;
    }
}
