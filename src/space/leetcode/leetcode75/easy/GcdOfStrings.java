package space.leetcode.leetcode75.easy;

public class GcdOfStrings {
    //str1 = x * n;
    //str2 = x * m;
    //str1 + str2 = x * (n + m)
    //
    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1+str2).equals(str2+str1))
            return "";

        int x = str1.length();
        int y = str2.length();
        int gcdNum = x % y == 0 ? y : x % y;

        while (true){
            if (x % y == 0)
                break;
            gcdNum = x % y;
            x = y;
            y = gcdNum;
        }
//        int gcdNum = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdNum);
    }
    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC","ABC"));
        System.out.println(gcdOfStrings("ABABAB","ABAB"));
        System.out.println(gcdOfStrings("LEET","CODE"));
    }
    //ACB ABC ABC
    //
}
