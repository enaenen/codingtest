package space.inflearn.java.section2.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowerUpperInverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();
        StringBuffer sb = new StringBuffer();
        for (char c : charArray) {
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(c);
        }
        System.out.println(sb);
    }
}
