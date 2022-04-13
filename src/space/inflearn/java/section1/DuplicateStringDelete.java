package space.inflearn.java.section1;

import java.util.Scanner;

public class DuplicateStringDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0; i<str.length(); i++){
            if (str.indexOf(str.charAt(i)) == i)
                System.out.print(str.charAt(i));
        }
    }
}
