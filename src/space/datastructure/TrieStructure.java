package space.datastructure;

import java.util.HashMap;
import java.util.Map;

public class TrieStructure {
    public static void main(String[] args){
        String[] words = {"word","war","warrior","world"};
        System.out.println(new TrieStructure().solution(words));
    }
    public int solution(String[] words) {
        int answer = 0;
        Trie trie= new Trie();
        for(int i=0;i< words.length;i++)
        {
            trie.insert(words[i]);
        }
        for(String word : words){
            word.charAt(word.length()-2);
        }

        return answer;
    }
    class TrieNode{
        private Map<Character,TrieNode> childNodes;
        private boolean isLastChar;
        private int depth;

        public TrieNode(){
            childNodes = new HashMap<Character, TrieNode>();
            isLastChar=false;
            depth++;
        }

        public Map<Character,TrieNode> getChildNodes(){
            return this.childNodes;
        }
        public boolean isLastChar(){
            return this.isLastChar;
        }
        public void setIsLastChar(boolean isLastChar){
            this.isLastChar=isLastChar;
        }
        public int getDepth(){return this.depth;}
    }
    class Trie{
        private TrieNode rootNode;

        public Trie(){
            rootNode = new TrieNode();
        }
        public void insert(String word){
            TrieNode thisNode = this.rootNode;
            for(int i=0;i<word.length();i++){
                thisNode = thisNode.getChildNodes().computeIfAbsent(word.charAt(i),c->new TrieNode());
            }
            thisNode.setIsLastChar(true);
        }
        public boolean contains(String word){
            TrieNode thisNode = this.rootNode;
            for(int i=0;i<word.length();i++){
                char character = word.charAt(i);
                TrieNode node = thisNode.getChildNodes().get(character);
                if(node==null) return false;
                thisNode = node;
            }
            return thisNode.isLastChar();
        }
        public void delete(String word){
            delete(this.rootNode, word, 0);
        }
        private void delete(TrieNode thisNode, String word, int index){
            char character = word.charAt(index);
            //아예 단어가 없는경우
            if(!thisNode.getChildNodes().containsKey(character)) throw new Error("There is no ["+word+"] in this Trie");

            TrieNode childNode = thisNode.getChildNodes().get(character);
            index++;

            if(index==word.length()){
                //노드는 존재하지만 insert한 단어가 아닌경우
                if(!childNode.isLastChar())
                    throw new Error("There is no ["+word+"] in this Trie.");

                childNode.setIsLastChar(false);
                if(childNode.getChildNodes().isEmpty())
                    thisNode.getChildNodes().remove(character);
            }
            else{
                delete(childNode,word,index);//콜백
                if(!childNode.isLastChar()&&childNode.getChildNodes().isEmpty())
                    thisNode.getChildNodes().remove(character);
            }
        }
    }
}

