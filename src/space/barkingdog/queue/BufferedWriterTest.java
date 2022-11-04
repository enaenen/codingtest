package space.barkingdog.queue;

import java.io.*;

public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        bw.write(s);
        bw.write("-1");
        int a = 3;
        bw.write(a+"");
        bw.flush();

    }
}
