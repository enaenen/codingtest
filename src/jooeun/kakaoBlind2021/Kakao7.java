import java.util.ArrayList;

class Solution {
    public int solution(int[] sales, int[][] links) {
        ArrayList<Sawon> sawon_list = new ArrayList<Sawon>();

        for(int i = 0; i < sales.length; i++){

            sawon_list.add(new Sawon(i+1, sales[i]));

        }

        Sawon s_h= null;
        Sawon s_t= null;

        for(int i= 0; i < links.length; i++){

            //팀장
            s_h = sawon_list.get(links[i][0] -1);

            //팀원
            s_t = sawon_list.get(links[i][1] -1);

            //팀장에게 팀원 정보 추가
            s_h.team_list.add(s_t);

            //팀원에게 팀장 정보 추가
            s_t.header = s_h;

        }

        //팀장 리스트 만들기
        ArrayList<Sawon> h_list = new ArrayList<Sawon>();
        for(int i = 0 ; i < sawon_list.size() ; i++){
            s_h = sawon_list.get(i);
            if(s_h.team_list.size() != 0){
                h_list.add(s_h);
            }
        }

        int result = 0;

        //각 팀별로 참가자의 아이디를 담음
        int[] in = new int[h_list.size()];
        int min = 1000;

        for(int i = 0; i < h_list.size() ; i++){

            s_h = h_list.get(i);

            //팀장의 아이디가 참가자 리스트에 있는지?
            for(int j = 0 ; j < in.length; j++){
                if(in[j] == s_h.id){
                    in[i] = s_h.id;
                    break;
                }
            }
            if(in[i] != 0)
                continue;

            //팀장의 생산성이 검사
            if(min > s_h.sales){
                min = s_h.sales;
                in[i] = s_h.id;
            }

            //팀원의 생산성 검사
            for(int j = 0 ; j < s_h.team_list.size(); j++){

                s_t = s_h.team_list.get(j);

                if(min > s_t.sales){
                    min = s_t.sales;
                    in[i] = s_t.id;
                }
            }

            result += min;
            min = 1000;

        }

        return result;
    }
}

class Sawon{

    int id;
    int sales;

    //팀장일 경우, 팀원의 정보를 갖고 있음.
    ArrayList<Sawon> team_list;

    //팀원 일 경우, 팀장의 정보를 갖고 있음.
    Sawon header = null;

    public Sawon(){}

    public Sawon(int id,int sales){
        this.id=  id;
        this.sales = sales;
        team_list = new ArrayList<Sawon>();
    }

}