package jooeun.codingtest.스타트업코딩페스티벌2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution4 {

    public static void main(String[] args){

        String preference_score = "4.0 3.0 2.1 4.3 5.0";
        int n = 2;
        int m = 3;
        String[] watched_record = {"WYO","YYO"};
        String[] watched_record_genre = {"ABC", "DCE"};

//        String preference_score = "4.0 3.0 4.4 4.3 5.0";
//        int n = 2;
//        int m = 3;
//        String[] watched_record = {"WYY","YYO"};
//        String[] watched_record_genre = {"ABC", "DCE"};

//        String preference_score = "4.0 3.0 3.0 4.3 5.0";
//        int n = 2;
//        int m = 3;
//        String[] watched_record = {"WYO","YYO"};
//        String[] watched_record_genre = {"ABC", "DCE"};

        String answer = solution(preference_score, n, m, watched_record, watched_record_genre);
        System.out.println(answer);
    }

    public static String solution(String preference_score, int n, int m, String[] watched_record, String[] watched_record_genre){

        // Genre ;  콘텐츠 위치, 선호도 점수를 담고있는 class
        List<Genre> list = new ArrayList<>();

        // 장르별 선호 별점 parsing
        String[] temp = preference_score.split(" ");
        for(int i = 0 ; i < temp.length; i++)
            list.add(new Genre((char)('A' + i), Float.parseFloat(temp[i])));

//        - 'O' → 유저가열람했으나 끝까지 보지 않은 콘텐츠
//        - 'W' → 유저가 열람했으며 끝까지 본 콘텐츠
//        - 'Y' → 유저가 열람한 적 없는 콘텐츠
        // 장르별로 Y인 경우, O인 경우 분류
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){


                switch(watched_record[i].charAt(j)){
                    case 'O' :
                        list.get(watched_record_genre[i].charAt(j) - 'A').list_o.add(new Location(i, j));
                        break;
                    case 'Y' :
                        list.get(watched_record_genre[i].charAt(j) - 'A').list_y.add(new Location(i, j));
                        break;
                    default: break;
                }
            }
        }



        // 장르 선호도 순으로 list sort
        Collections.sort(list, new Comparator<Genre>() {
            @Override
            public int compare(Genre o1, Genre o2) {
                return o1.compareTo(o2);
            }
        });

        // 장르에 따른 'Y', 'O' 콘텐츠 sort
        for(Genre genre : list){

            // 'O'
            Collections.sort(genre.list_o, new Comparator<Location>() {
                @Override
                public int compare(Location o1, Location o2) {
                    return o1.compareTo(o2);
                }
            });

            // 'Y'
            Collections.sort(genre.list_y, new Comparator<Location>() {
                @Override
                public int compare(Location o1, Location o2) {
                    return o1.compareTo(o2);
                }
            });
        }

        StringBuilder  sb = new StringBuilder();
//        1. 유저가 열람한 적 없는 콘텐츠를 장르 선호도가 높은 콘텐츠부터 순서대로 추천
        for(int i = 0 ; i < list.size(); i++)

            for(Location l : list.get(i).list_y)
                sb.append(list.get(i).toString() + " "+ l.toString());

//        2. 유저가 열람했으나 끝까지 다 보지 못한 콘텐츠를 장르 선호도가 높은 콘텐츠부터 순서대로 추천
        for(int i = 0 ; i < list.size(); i++)

            for(Location l : list.get(i).list_o)
                sb.append(list.get(i).toString() + " "+ l.toString());


        return sb.toString();
    }
}

class Genre implements Comparable<Genre>{

    char name;
    float score;
    ArrayList<Location> list_o;
    ArrayList<Location> list_y;

    public Genre(){}
    public Genre(char name, float score){
        this.name = name;
        this.score = score;

        list_o = new ArrayList<>();
        list_y = new ArrayList<>();
    }

    public String toString(){
        return name + " " + score;
    }

    // 장르 선호도가 더 높을 수록 앞으로 오도록
    public int compareTo(Genre g){

        if(this.score < g.score)
            return 1;
        else
            return -1;
    }

}

class Location implements Comparable<Location>{
    int row;
    int column;

    public Location(){}

    public Location(int row, int column){
        this.row = row;
        this.column = column;
    }

    public String toString(){
        return row + " " + column + "\n";
    }

    // row, column 이 작을 수록 앞으로 오도록
    public int compareTo(Location l){

        if(this.row > l.row)
            return 1;
        else if(this.row == l.row)
            if(this.column > l.column)
                return 1;
        return -1;
    }
}
