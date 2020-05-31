package space.programmers.hashmap;

import java.util.*;

public class BestAlbum {
    public static void main(String[] args){
        String[] genres = {"classic","pop","classic","classic","pop"};
        int[] plays = {500,600,150,800,2500};

        String[] genres2 = {"a","b","c","d","e","a","a","b","b"};
        int[] plays2 =     {40,40,1,2,3,40,30,5,1};

        int[] answer = new BestAlbum().solution(genres2,plays2);
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
    //HashMap에서 최고값을 찾기위한 메소드
    private String findTopGenre(Map<String,Integer> map){
        Map.Entry<String,Integer> maxEntry = null;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(maxEntry==null || entry.getValue().compareTo(maxEntry.getValue())>0){
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }
    public int[] solution(String[] genres, int[] plays) {
        if(plays.length==1){
            return new int[]{0};
        }

        ArrayList<Music> list = new ArrayList<Music>();
        HashMap<String,Integer> genreCounter = new HashMap<String,Integer>();

        for(int i=0;i<genres.length;i++){
            list.add(new Music(genres[i],plays[i],i));
            genreCounter.put(genres[i],genreCounter.getOrDefault(genres[i],0)+plays[i]);
        }
        //재생수 별 장르 2개 고르기
        String topGenre=findTopGenre(genreCounter);
        genreCounter.remove(topGenre);
        String secondGenre=findTopGenre(genreCounter);


        for(int i=0;i<list.size();i++){
            System.out.println("plays : "+             list.get(i).getPlays()+" "
                    +"NO : "+ list.get(i).getNo()+" "+
                    "Genre : "+list.get(i).getGenre());

        }
        System.out.println();
        //재생 수 높은 2곡 찾기
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println("plays : "+             list.get(i).getPlays()+" "
            +"NO : "+ list.get(i).getNo()+" "+
                    "Genre : "+list.get(i).getGenre());

        }


        //answer List 작성
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        int cnt =0;
        for(int i=0;i<list.size();i++){

        }
        for(int j=0;j<list.size();j++){
            String g = list.get(j).getGenre();
            int number = list.get(j).getNo();
            if(g.compareTo(topGenre)==0 && cnt<2) {
                answerList.add(number);
               // list.remove(j);
                cnt++;
            }
        }
        cnt=0;
        for(int j=0;j<list.size();j++){
            String g = list.get(j).getGenre();
            int number = list.get(j).getNo();
            if(g.compareTo(secondGenre)==0 && cnt<2) {
                answerList.add(number);
                cnt++;
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i]=answerList.get(i);
        }
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i).getGenre() +" " + list.get(i).getNo());
//        }
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