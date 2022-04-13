package space.inflearn.java.section1;

import java.util.Scanner;

public class ConvertUpperLower {
    public static boolean isUpperCase(char c){
        if (c <= 'Z' && 'A' <= c)
            return true;
        return false;
    }
    public static boolean isLowerCase(char c){
        if (c <= 'z' && 'a' <= c)
            return true;
        return false;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        char strArr[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++){
            if (isLowerCase(strArr[i]))
            strArr[i] -= 32;
        else if (isUpperCase(strArr[i]))
                strArr[i] += 32;
        }
        System.out.println(strArr);
        return ;
    }
}
