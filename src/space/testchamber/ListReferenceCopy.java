package space.testchamber;

import java.util.LinkedList;
import java.util.Queue;

public class ListReferenceCopy {
    public static void main(String[] args) {
        Queue<Character> que1 = new LinkedList<>();
        Queue<Character> que2;
        Queue<Character> que3 = new LinkedList<>();
        que1.add('a');
        que1.add('b');
        que1.add('c');
        que2 = que1;
        que2.poll();

        //얕은복사
        for (Character character : que1) {
            System.out.println(character);
        }
        for (Character character : que3) {
            System.out.println("q3 = " + character);
        }
    }
}
