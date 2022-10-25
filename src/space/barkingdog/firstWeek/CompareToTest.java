package space.barkingdog.firstWeek;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class CompareToTest {
    public static void main(String[] args) {
        String str = "abcd";
        int ab = str.compareTo("ad");
        //100 99 98 97
        //97 99
        int[] a = {3, 2, 1};
//        HashSet<Integer> hs = new HashSet<>(a.to);
        System.out.println(Arrays.stream(a).max().getAsInt());
        Arrays.sort(a);
        System.out.println("ab = " + ab);
    }
}
