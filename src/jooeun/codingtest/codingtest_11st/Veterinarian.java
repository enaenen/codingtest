package jooeun.codingtest.codingtest_11st;

import java.util.LinkedList;
import java.util.Queue;

public class Veterinarian {

    private Queue queue;

    public Veterinarian(){
        this.queue = new LinkedList();
    }

    public void accept(String petName) {

        this.queue.add(petName);

    }

    public String heal() {

        return this.queue.poll().toString();

    }

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Barkley");
        veterinarian.accept("Mittens");
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
    }

}