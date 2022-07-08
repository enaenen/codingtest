package space.studyin42.sorting;

import sun.jvm.hotspot.memory.HeapBlock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class ArraySwap2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputs = br.readLine().toCharArray();
        int k = inputs[2] - '0';
        PriorityQueue<Integer> arr1 = new PriorityQueue<>();
        PriorityQueue<Integer> arr2 = new PriorityQueue<>(Collections.reverseOrder());
        char[] inputFirst = br.readLine().trim().replaceAll(" ", "").toCharArray();
        char[] inputSecond = br.readLine().trim().replaceAll(" ", "").toCharArray();


        for (char c : inputFirst)
            arr1.add(c - '0');
        for (char c : inputSecond)
            arr2.add(c - '0');
        for (int i = 0; i < k; i++){
            int a = arr1.poll();
            int b = arr2.poll();
            arr1.add(b);
            arr2.add(a);
        }
        int sum=arr1.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
