package space.programmers.hashmap;

import java.util.*;

public class BestAlbum {
    public static void main(String[] args){
        String[] genres = {"classic","pop","classic","classic","pop"};
        int[] plays = {500,600,150,800,2500};

        String[] genres2 = {"a","b","c","d","e","a","a","b","b"};
        int[] plays2 =     {40,40,1,2,3,40,30,5,1};

        String[] genres3 = {"a","b","c","d"};
        int[] plays3 =     {1,1,1,1};

        int[] answer = new BestAlbum().solution(genres3,plays3);
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
    //HashMap에서 최고값을 찾기위한 메소드

    public int[] solution(String[] genres, int[] plays) {
        if(plays.length==1){
            return new int[]{0};
        }

        ArrayList<Music> musicList = new ArrayList<Music>();
        HashMap<String,Integer> genreCounter = new HashMap<String,Integer>();

        for(int i=0;i<genres.length;i++){
            musicList.add(new Music(genres[i],plays[i],i));
            genreCounter.put(genres[i],genreCounter.getOrDefault(genres[i],0)+plays[i]);
        }
        //재생수 별 장르 2개 고르기
        ArrayList<String> topGenreList = new ArrayList<String>(genreCounter.keySet());
        Collections.sort(topGenreList,(o1,o2) -> (genreCounter.get(o2).compareTo(genreCounter.get(o1))));

        //재생 수 높은 곡 순으로 정렬
        Collections.sort(musicList);

        //answer List 작성
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        for(int i=0;i<topGenreList.size();i++){
            int cnt =0;
            String toFindGenre = topGenreList.get(i);
            for(int j=0;j<musicList.size();j++){
                if(musicList.get(j).getGenre().compareTo(toFindGenre)==0){
                    cnt++;
                    if(cnt==2){
                        break;
                    }
                    answerList.add(musicList.get(j).getNo());
                }
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i]=answerList.get(i);
        }

        return answer;
    }
    private class Music implements Comparable<Music>{
        private String genre;
        private int plays;
        private int no;

        public Music(){};
        public Music(String genre, int plays,int no){
            this.genre=genre;
            this.plays=plays;
            this.no=no;
        }
        public String getGenre(){
            return this.genre;
        }
        public int getPlays(){
            return this.plays;
        }
        public int getNo() {
            return this.no;
        }
        @Override
        //재생 빈도는 내림차순 정렬
        public int compareTo(Music o) {
            if(this.plays>o.plays) return -1;
            else if (this.plays==o.plays){
                //재생 빈도가 같을때
                // 노래 고유번호 순으로 오름차순 정렬
                if(this.getNo()>o.getNo()) return 1;
                else if(this.getNo()<o.getNo()) return -1;
                else return 0;
            }
            else return 1;
        }
    }
}