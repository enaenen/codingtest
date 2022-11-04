package space.barkingdog.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegexTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().replace("[","").replace("]","");
        System.out.println(s);
    }
}
