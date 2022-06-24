package space.studyin42;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Direction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] plans = br.readLine().split(" ");
        int x = 0;
        int y = 0;

        for (String plan : plans) {
            if (plan.equals("R"))
                ;
            else if (plan.equals("U"))
                ;
            else if (plan.equals("D"))
                ;
            else if (plan.equals("L"))
                ;
        }

    }
}
