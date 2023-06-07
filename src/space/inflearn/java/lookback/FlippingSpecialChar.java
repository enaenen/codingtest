package space.inflearn.java.lookback;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlippingSpecialChar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            if (Character.isAlphabetic(charArray[start]) && Character.isAlphabetic(charArray[end])) {
                char tmp = charArray[start];
                charArray[start++] = charArray[end];
                charArray[end--] = tmp;
            }
            else if (Character.isAlphabetic(charArray[start]))
                end--;
            else if (Character.isAlphabetic(charArray[end]))
                start++;
            else {
                end--;
                start++;
            }
        }
        System.out.println(charArray);
    }
}
