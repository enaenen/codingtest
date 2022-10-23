package space.baekjoon.linkedlist;

import java.io.*;
import java.util.*;

public class P1406_iter {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputStr = br.readLine();
        List<Character> list = new LinkedList<Character>();

        for (char c : inputStr.toCharArray())
            list.add(c);

        ListIterator<Character> listIter = list.listIterator();
        while(listIter.hasNext())
            listIter.next();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");
            if (cmd[0].equals("P")) {
                listIter.add(cmd[1].charAt(0));
            } else if (cmd[0].equals("B") && listIter.hasPrevious()) {
                listIter.previous();
                listIter.remove();
            } else if (cmd[0].equals("L") && listIter.hasPrevious()) {
               listIter.previous();
            } else if (cmd[0].equals("D") && listIter.hasNext()) {
                listIter.next();
            }
        }
        while (listIter.hasPrevious())
            listIter.previous();
        while (listIter.hasNext())
            bw.write(listIter.next());
        bw.flush();
        bw.close();
    }
}
