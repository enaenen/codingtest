package space.barkingdog.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class P2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] towers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Stack<Integer> towerStack = new Stack<Integer>();
        for (int tower : towers) {
            towerStack.push(tower);
        }
        Stack<Integer> searchStack = new Stack<Integer>();
        searchStack.addAll(towerStack);

        System.out.println("searchStack.peek() = " + searchStack.peek());
        System.out.println("towerStack = " + towerStack.peek());

        StringBuilder sb = new StringBuilder();
        while(!towerStack.empty()){

        }
    }
}
