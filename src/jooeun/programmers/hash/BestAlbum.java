package jooeun.programmers.hash;

import java.util.*;

public class BestAlbum {

    public static void main(String[] args){
        String[] genres = {"classic", "pop", "classic", "classic"};
        int[] plays = {500, 600, 150, 800};
        int[] answer = solution(genres,plays);

        for(int i : answer){
            System.out.print(i + " / ");
        }

    }
    public static int[] solution(String[] genres, int[] plays){

        Map<String, Integer> play_cnt = new HashMap<String, Integer>();
        Map<String, ArrayList<Song>> song_list = new HashMap<String, ArrayList<Song>>();

        for(int i = 0 ; i < genres.length ; i++){

            ArrayList<Song> temp = song_list.get(genres[i]);

            if(temp == null){
                play_cnt.put(genres[i],plays[i]);
                temp = new ArrayList<Song>();

            }else{
                play_cnt.replace(genres[i],play_cnt.get(genres[i]) + plays[i]);

            }

            temp.add(new Song(genres[i],plays[i],i));
            song_list.put(genres[i],temp);

        }

        System.out.println(song_list.toString());
        System.out.println(play_cnt.toString());

        int len = 0;
        Iterator<String> it = song_list.keySet().iterator();
        while(it.hasNext()){
            String g = it.next();
            if(song_list.get(g).size() == 1){
                len++;
            }else{
                len +=2;
            }
        }

        int[] answer = new int[len];

        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(play_cnt.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        int idx = -1;
        for(Map.Entry<String,Integer> obj : list){

            ArrayList<Song> songs = song_list.get(obj.getKey());
            Collections.sort(songs);

            answer[++idx] = songs.get(0).num;

            if(songs.size() > 1)
                answer[++idx] = songs.get(1).num;

        }

        return answer;

    }

}

class Song implements Comparable<Song>{

    String genre;
    int play;
    int num;

    public Song(){}

    public Song(String genre, int play, int num){
        this.genre = genre;
        this.play = play;
        this.num = num;
    }

    public String toString(){
        return "genre : " + this.genre +  "/ play : " + this.play + "/ num : "  + this.num;
    }

    public int compareTo(Song s){

        //플레이 횟수에 대해서는 오름차순
        if(this.play < s.play){
            return 1;
        }else if(this.play == s.play){

            //고유 번호에 대해서는 내림차순
            if(this.num > s.num){
                return 1;
            }
        }

        return -1;
    }

}
