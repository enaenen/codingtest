package space.barkingdog.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder initString = new StringBuilder(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int index = initString.length();
        for(int i= 0; i < n; i++)
        {
            char[] commands = br.readLine().toCharArray();
            if (commands[0] == 'P')
            {
                initString.insert(index, commands[2]);
                index++;
            }
            else if (commands[0] == 'L'){
                if(index != 0)
                    index--;
            }
            else if (commands[0] == 'D'){
                if (index < (initString.length()))
                    index++;
            }
            else if (commands[0] == 'B'){
                if (index != 0) {
                    initString.deleteCharAt(index - 1);
                    index--;
                }
            }
        }
        System.out.println(initString);
    }
}
