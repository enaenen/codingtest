package space.leetcode.leetcode75;

public class MergeAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        sb.append(word1.charAt(0));
        int w1 = 1;
        int w2 = 0;
        int index = 1;
        while (w1 < word1.length() || w2 < word2.length()){
            if ((index % 2 != 0)  && w2 < word2.length())
                sb.append(word2.charAt(w2++));
            else if (w1 < word1.length())
                sb.append(word1.charAt(w1++));
            ++index;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("apbqcr");
        System.out.println(mergeAlternately("abc", "pqr"));

        System.out.println("apbqrs");
        System.out.println(mergeAlternately("ab", "pqrs"));

        System.out.println("apbqcd");
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}
