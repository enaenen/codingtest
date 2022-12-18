package space.programmers.lv0;


import java.util.Arrays;

public class ArraysAverageValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        double asDouble = Arrays.stream(arr).average().getAsDouble();
        System.out.println("asDouble = " + asDouble);
    }
}
