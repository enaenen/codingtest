package space.barkingdog.firstWeek;

import java.util.Arrays;

public class CompareToTest {
    public static void main(String[] args) {
        String str = "abcd";
        int ab = str.compareTo("ad");
        //100 99 98 97
        //97 99
        int[] a = {3, 2, 1};
        Arrays.sort(a);
        System.out.println("ab = " + ab);
    }
}
