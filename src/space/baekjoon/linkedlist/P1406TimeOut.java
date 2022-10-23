package space.baekjoon.linkedlist;

import java.io.*;
import java.util.LinkedList;

public class P1406TimeOut {
    public static void main(String[] args) throws IOException {
        LinkedList<Character> list = new LinkedList<Character>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputStr = br.readLine();
        StringBuilder sb = new StringBuilder(inputStr);
        int currentIndex = 0;
        for (char c : inputStr.toCharArray()) {
            list.add(currentIndex++, c);
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++){
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("P")) {
                list.add(currentIndex++, cmd[1].charAt(0));
            }
            else if (cmd[0].equals("B") && 0 < currentIndex){
                list.remove(currentIndex - 1);
                currentIndex--;
            }
            else if (cmd[0].equals("L") && 0 < currentIndex){
                currentIndex--;
            }
            else if (cmd[0].equals("D") && currentIndex < list.size()){
                currentIndex++;
            }
        }
        for (Character character : list) {
            bw.write(character);
        }
        bw.flush();
        bw.close();
    }
}
