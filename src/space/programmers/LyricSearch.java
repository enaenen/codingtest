package space.programmers;

public class LyricSearch {
    public int[] solution(String[] words, String[] queries) {
        int[] answer = {};
        return answer;
    }



    public static void main(String[] args){
        String[] words = {"frodo","front","frost","frozen","frame","kakao"};
        String[] queries = {"fro??","????o","fr???","fro???","pro?"};
        int[] answer = new LyricSearch().solution(words,queries);
        for(int a : answer){
            System.out.println(a);
        }
    }
}
