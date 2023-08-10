package space.leetcode.leetcode75.medium;


public class StringCompression {
    public static void main(String[] args) {

        System.out.println(compressV2(new char[]{'a' , 'a' , 'b' , 'b' , 'c' , 'c' , 'c' }));
        System.out.println(compressV2(new char[]{'a' }));
        System.out.println(compressV2(new char[]{'a' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' , 'b' }));
    }
    public static int compressV2(char[] chars) {
        int i = 0, idx = 0;
        while (i < chars.length){
            int j = i;
            while (j < chars.length && chars[i] == chars[j])
                j++;
            chars[idx++] = chars[i];
            int len = j - i;
            if (1 < len){
                for (char c : String.valueOf(len).toCharArray()) {
                    chars[idx++] = c;
                }
            }
            i = j;
        }
        return idx;
    }

    public static int compressV1(char[] chars) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(chars[0]);
        int count = 1;
        int bufferIndex = 0;

        int length = chars.length;
        for (int i = 1; i < length; ++i) {
            if (chars[i] == buffer.charAt(bufferIndex)) {
                count++;
            } else {
                if (count != 1)
                    buffer.append(count);
                count = 1;
                buffer.append(chars[i]);
                bufferIndex = buffer.length()-1;
            }
        }
        if (count != 1)
            buffer.append(count);
        for (int i = 0; i < buffer.length(); ++i){
            chars[i] = buffer.charAt(i);
        }
        return buffer.length();
    }
}
