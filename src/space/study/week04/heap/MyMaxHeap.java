package space.study.week04.heap;

import java.util.ArrayList;
import java.util.List;

public class MyMaxHeap {

    private static List<Integer> heap = new ArrayList<>();

    public static void main(String[] args) {
        //heap.add(1001);
        insert(9);
        insert(7);
        insert(6);
        insert(5);
        insert(4);
        insert(3);
        insert(2);
        insert(2);
        insert(1);
        insert(3);

        delete(2);

        for (Integer num : heap) {
            System.out.println(num);
        }

    }

    private static void swap(int to, int from) {
        int tmp = heap.get(to);
        heap.set(to, heap.get(from));
        heap.set(from, tmp);
    }

    public static void insert(int n) {
        heap.add(n);
        for (int i = heap.size() - 1; i > 1; i /= 2) {
            if (heap.get(i / 2) < heap.get(i))
                swap(i / 2, i);
            else
                break;
        }

    }
//DELETE 안됨
    public static void delete(int n) {
        int removeNodeIndex = heap.indexOf(n);
        int lastNodeIndex = heap.size() - 1;
        heap.set(heap.get(removeNodeIndex), heap.get(lastNodeIndex));
        heap.remove(heap.get(lastNodeIndex));
        for (int i = 0; i*2 < heap.size();) {
            if(heap.get(i) >= heap.get(i*2) && heap.get(i) >= heap.get(i*2+1))
                break;
            else if(heap.get(i)<=heap.get(i*2)) {
                swap(heap.get(i * 2), heap.get(i));
                i=i*2;
            }
            else if(heap.get(i)<heap.get(i*2+1)) {
                swap(heap.get(i * 2 + 1), heap.get(i));
                i=i*2+1;
            }
        }
    }
}
