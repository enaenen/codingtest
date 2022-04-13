package space.inflearn.java.section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFound {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine().toLowerCase();
        String inputChar = br.readLine().toLowerCase();
        int counter = 0;

        for(int i=0; i<inputLine.length(); i++){

            char[] chars = inputLine.toLowerCase().toCharArray();
            if (chars[i] == inputChar.charAt(0))
                counter++;
        }
        System.out.println(counter);
    }
}

