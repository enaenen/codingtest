package space.barkingdog.firstWeek;

import java.util.Arrays;

public class P2752 {
    public static void main(String[] args) {
        String[] arr = "3 1 2".split(" ");
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
