package space.leetcode.leetcode75.medium;

public class ReverseWords {
    public static String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        String[] s1 = s.split("\\s+");
        for(int i = s1.length - 1; -1 < i; --i){
            sb.append(s1[i].trim());
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good    example"));
    }
}
