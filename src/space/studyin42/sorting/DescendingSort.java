package space.studyin42.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DescendingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];


        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Integer[] arr3 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr3, Collections.reverseOrder());
        for (int i : arr3) {
            System.out.print(i+ " ");
        }
    }
}
