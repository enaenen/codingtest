package space.leetcode.prac;
/**
 * https://leetcode.com/problems/is-subsequence/submissions/?envType=study-plan-v2&envId=leetcode-75
 */
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ajeeebjejfc"));
        System.out.println(isSubsequence("abc", "ajeeebjej"));
    }
        public static boolean isSubsequence(String s, String t) {
            if (t.length() < s.length())
                return false;
            if (s.isEmpty())
                return true;
            char[] inputString = s.toCharArray();
            int index = 0;
            for(int i = 0; i < t.length(); ++i){
                if (inputString[index] == t.charAt(i)){
                    ++index;
                    if (index == inputString.length)
                        return true;
                }
            }
            return (index == inputString.length);
        }
}
