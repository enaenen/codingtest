package space.programmers.lv0;

import java.util.Arrays;

public class ArrayFindMax {
    public static void main(String[] args) {
        int[] arr = {1,2,100,4,5};
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
