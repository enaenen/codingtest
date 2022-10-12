package space.testchamber;

import java.io.IOException;
import java.io.InputStream;

public class InputTests {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        byte[] n = new byte[10];
        is.read(n);
        for (byte b : n) {
            System.out.println("b = " + b);
        }
    }
}
