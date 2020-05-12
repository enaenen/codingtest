package space.datastructure;

import java.util.LinkedList;
import java.util.NoSuchElementException;

class QueueP<T>{
    class Node<T>{
        private Node<T> next;
        private T item;
        public Node(T data){
            this.item = data;
        }
    }
    private Node<T> first;
    private Node<T> last;

    public void add(T item){
        Node<T> t = new Node<T>(item);
        if(last != null){
            last.next = t;
        }
        last = t;
        if( first == null){
            first=last;
        }
    }
    public T remove(){
        if(first==null) throw new NoSuchElementException();
        T data = first.item;
        first = first.next;
        if(first==null) {
            last = null;
        }
        return data;
    }
    public T peek(){
        if(first==null) throw new NoSuchElementException();

        return first.item;
    }
}

class Graph{
    class Node{
        int data;
        LinkedList<Node> adjacent;
        boolean marked;//방문 마크 플래스
        Node (int data){
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<Node>();
        }
    }
    Node[] nodes;
    public Graph(int size){
        nodes = new Node[size];
        for(int i=0;i<size; i++){
            nodes[i]=new Node(i);
        }
    }
    void addEdge(int i1,int i2){
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

    }
}
public class DFSPrac {

}
