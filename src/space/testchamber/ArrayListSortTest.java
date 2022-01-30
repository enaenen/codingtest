package space.testchamber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSortTest {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(9);
        intList.add(1);
        intList.add(5);
        intList.add(3);
        Collections.sort(intList);
        //not Arrays.sort(l.toArray);
        for (Integer num : intList) {
            System.out.println(num);
        }
    }
}
