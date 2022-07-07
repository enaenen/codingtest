package space.studyin42.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class ArraySwap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] inputs = br.readLine().toCharArray();
        int arrayLength = inputs[0] - '0';
        int k = inputs[2] - '0';

        int[] arr1 = new int[k];
        String input = br.readLine();
        char[] trimedInput = input.trim().toCharArray();
        for (int j = 0; j < arrayLength; j++)
            arr1[j] = trimedInput[j];

        int[] arr2 = new int[k];
        input = br.readLine();
        trimedInput = input.trim().toCharArray();
        for (int j = 0; j < arrayLength; j++)
            arr2[j] = trimedInput[j];
        Arrays.sort(trimedInput);
        Integer[] arr3 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
        Arrays.sort(arr3, Collections.reverseOrder());
        for (int i = 0; i < k; i++){
            if (arr1[i] < arr3[i]){
                int tmp = arr1[i];
                arr1[i] = arr3[i];
                arr3[i] = tmp;
            }
        }
        int ret = 0;
        for (Integer n : arr3) {
            ret += n;
        }
        System.out.println(ret);
    }
}
