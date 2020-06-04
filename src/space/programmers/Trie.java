package space.programmers;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    private class TrieNode{
        //자식 노드 맵
        private Map<Character, TrieNode> childNodes = new HashMap<Character, TrieNode>() ;
        //마지막 글자 여부
        private boolean isLastChar;

        public Map<Character,TrieNode> getChildNodes(){
            return this.childNodes;
        }
        public boolean isLastChar(){
            return this.isLastChar;
        }
        public void setIsLastChar(boolean isLastChar){
            this.isLastChar=isLastChar;
        }
    }

    //루트 노드
    private TrieNode rootNode;

    public Trie(){
        rootNode = new TrieNode();
    }
    public void insert(String word){
        TrieNode thisNode = this.rootNode;
        for(int i=0;i<word.length();i++){
            /*
            해당 계층 문자의 자식노드가 존재하지 않을때 람다식을 이용하여 자식노드를 생성
             */
            thisNode = thisNode.getChildNodes().computeIfAbsent(word.charAt(i),c->new TrieNode());
        }
        thisNode.setIsLastChar(true);
    }
    public boolean contains(String word){
        TrieNode thisNode = this.rootNode;
        //루트노드부터 순서대로 알파벳이 일치하는 자식 노드들 검색
        for(int i=0;i<word.length();i++){
            char character = word.charAt(i);
            TrieNode node = thisNode.getChildNodes().get(character);

            if(node ==null) return false;

            thisNode=node;
        }
        //마지막 노드에 isLastChar가 True 여야 단어가 완성
        return thisNode.isLastChar();
    }
    //자식노드 없어야함
    //삭제를 시작하는 첫 노드는 isLastChar==true
    //삭제를 진행하는 중에는 isLastChar==false
    public void delete(String word){
        delete(this.rootNode,word,0);
    }
    private void delete(TrieNode thisNode, String word, int index){
        char character = word.charAt(index);
        //아예 없는 단어일 경우 에러처리
        if(!thisNode.getChildNodes().containsKey(character)) throw new Error("NO SUCH AS "+word);

        TrieNode childNode =thisNode.getChildNodes().get(character);
        index++;
        if(index == word.length()){
            //노드는 존재하지만 insert 한 단어가 아닌경우 에러 출력
            if(!childNode.isLastChar()) throw new Error("NO SUCH AS "+word);

            childNode.setIsLastChar(false);

            //삭제 대상 언어의 제일 끝으로서 자식 노드가 없으면 삭제 시작
            if(childNode.getChildNodes().isEmpty())
                thisNode.getChildNodes().remove(character);
        }
        else{
            delete(childNode,word,index);//콜백

            //삭제 중, 자식노드가 없고, 현재 노드로 끝나는 다른 단어가 없는경우 이 노드 삭제
            if(!childNode.isLastChar() && childNode.getChildNodes().isEmpty())
                thisNode.getChildNodes().remove(character);
        }

    }

    public static void main(String[] args){
        Trie trie = new Trie();
        trie.insert("PI");
        trie.insert("PIE");
        trie.insert("POW");
        trie.insert("POP");

        trie.contains("POW");
        trie.contains("PIES");

        trie.delete("POP");
        trie.contains("POP");

        //trie.delete("POP");
        //trie.delete("PIE");
        //trie.delete("PEN");
    }
}
