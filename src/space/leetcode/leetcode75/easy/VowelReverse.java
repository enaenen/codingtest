package space.leetcode.leetcode75.easy;

public class VowelReverse {
    public static void main(String[] args) {
        System.out.println("holle = " + reverseVowels("hello"));
        System.out.println("leotcede = " + reverseVowels("leetcode"));
    }
    public static boolean isVowel(char c){
        Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    public static String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        while (start < end){
            if (isVowel(arr[start]) && (isVowel(arr[end]))){
                char tmp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = tmp;
            } else if (!isVowel(arr[start])){
                ++start;
            }
            else if (!isVowel(arr[end])){
                --end;
            }
            else{
                ++start;
                --end;
            }
        }
        return String.valueOf(arr);
    }
}
