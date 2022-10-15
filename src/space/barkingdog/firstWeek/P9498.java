package space.barkingdog.firstWeek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9498 {

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int score = Integer.parseInt(br.readLine());
            char result = 'F';
            if (89 < score)
                result = 'A';
            else if (79 < score)
                result = 'B';
            else if (69 < score)
                result = 'C';
            else if (59 < score)
                result = 'D';
            System.out.println(result);
        }
}
