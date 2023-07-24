package space.leetcode.leetcode75.medium;

import java.util.Deque;
import java.util.LinkedList;

public class MaxVowels {
    public static void main(String[] args) {
        System.out.println("expect = 3, " + maxVowels("abciiidef", 3));
        System.out.println("expect = 2, " + maxVowels("aeiou", 2));
        System.out.println("expect = 2, " + maxVowels("leetcode", 3));

    }

    public static boolean isVowel(char c){
        return (c == 'a' || c =='e' || c=='i' || c=='o' || c=='u');
    }
    public static int maxVowels(String s, int k) {
        if (k == 1)
            return 1;
        int count = 0;

        for (int i = 0 ; i < k; ++i) {
            if (isVowel(s.charAt(i))){
                count++;
            }
        }

        int max;
        max = count;

        for (int i = k; i < s.length(); ++i){
            if (isVowel(s.charAt(i - k)))
                count--;
            if (isVowel(s.charAt(i)))
                count++;
            max = Math.max(max, count);
        }
        return max;
    }
    public static int maxVowelsDeque(String s, int k) {
        if (k == 1)
            return 1;
        Deque<Character> arr = new LinkedList<>();
        int count = 0;

        for (int i = 0 ; i < k; ++i) {
            arr.offer(s.charAt(i));
            if (isVowel(s.charAt(i))){
                count++;
            }
        }

        int max;
        max = count;

        for (int i = k; i < s.length(); ++i){
            if (isVowel(arr.poll()))
                count--;
            arr.offer(s.charAt(i));
            if (isVowel(s.charAt(i)))
                count++;
            max = Math.max(max, count);
        }
        return max;
    }

}
