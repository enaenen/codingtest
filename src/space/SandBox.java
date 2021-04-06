package space;

import java.util.Arrays;
import java.util.Calendar;

public class SandBox {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        c.add(Calendar.YEAR, 2000);
//        System.out.println(c.getTime());
        System.out.println("a".compareTo("az"));
        String[] str = new String[] {"abce", "abcd", "cdx"};
        Arrays.sort(str);
        for (String s : str) {
            System.out.println(s);
        }
        int[] aryInt = new int[] {5,4,3,2,1};
        Arrays.sort(aryInt);
        for (int i : aryInt) {
            System.out.println(i);
        }
    }
}
