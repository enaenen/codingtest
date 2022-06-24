package space.etc;

public class Sol {
    public static String sol(String sentence, String keyword, int[] skips)
    {
        String answer = "";
        keyword = keyword;
        StringBuilder sbSentence = new StringBuilder(sentence);
        char[] keywordArray = keyword.toCharArray();
        int cnt = 0;
        int m = 0;
        int offset = 0;

        for (int i = 0; i < skips.length; i++) {
            offset += skips[i];
            if (sbSentence.charAt(cnt + offset) == keyword.charAt(m % keyword.length()))
            {
                sbSentence.insert(cnt + offset + 1, keyword.charAt(m % keyword.length()));
            }
            else {
                sbSentence.insert(cnt + offset, keyword.charAt(m % keyword.length()));
            }
            m++;
            cnt++;
        }
        return sbSentence.toString();
    }// mai love coding
    public static void main(String[] args) {
        System.out.println("mai lsovke comodinag");
        System.out.println("mi loove coding");
        System.out.println(sol("i love coding", "mask", new int[] {0,0,3,2,3,4}));
        System.out.println(sol("i love coding", "mode", new int[] {0,10}));
    }
}
