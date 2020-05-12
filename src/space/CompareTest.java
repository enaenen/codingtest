package space;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {
    public static void main(String[] args){
        String first = "2";
        String second = "1";
        String[] list = new String[2];
        list[0]=first;
        list[1]=second;
        System.out.println(compare(first,second));

//
//        Arrays.sort(list,new Comparator<String>(){
//            public int compare(String o1, String o2){
//                return(o2+o1).compareTo(o1+o2);
//            }
//        });



    }

    public static int compare(String o1, String o2){
        return(o2+o1).compareTo(o1+o2);
    }
}
