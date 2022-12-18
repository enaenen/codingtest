package space.programmers.lv0;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};

        Arrays.sort(Arrays.stream(arr).boxed().toArray(), Collections.reverseOrder());
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
