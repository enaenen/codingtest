package space.programmers.level1;

import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.stream(arr).average().getAsDouble();
    }
}
