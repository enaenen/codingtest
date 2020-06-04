package space.programmers;

public class AutoComplete {
    private TrieNode rootNode = new TrieNode();

    private class TrieNode{
        private TrieNode[] children;
        private int wordCnt;
        private boolean isWord;

        public TrieNode(){
            children = new TrieNode[26];
            wordCnt =0;
            isWord=false;
        }
    }
    public void insert(String key){
        TrieNode thisNode = rootNode;
        for(int i=0;i<key.length();i++){
            int index = key.charAt(i)-'a';
            if(thisNode.children[index]==null)
                thisNode.children[index] = new TrieNode();
            thisNode.wordCnt++;
            thisNode = thisNode.children[index];
        }
        thisNode.isWord=true;
        thisNode.wordCnt++;
    }

    public int countingNode(String key){
        TrieNode thisNode = rootNode;
        for(int i=0;i<key.length();i++){
            int index = key.charAt(i)-'a';
            if(thisNode.wordCnt==1)
                return i;
            thisNode = thisNode.children[index];
        }
        return key.length();
    }
    public int solution(String[] words) {
        int answer = 0;
        for(String word : words){
            insert(word);
        }

        for(String word : words){
            answer += countingNode(word);
        }
        return answer;
    }
    public static void main(String[] args){
        String[][] words = {{"go","gone","guild"},
                {"abc","def","ghi","jklm"},
                {"word","war","warrior","world"}};

        for(int i=0;i<words.length;i++){
            System.out.println(new AutoComplete().solution(words[i]));
        }

    }
}
