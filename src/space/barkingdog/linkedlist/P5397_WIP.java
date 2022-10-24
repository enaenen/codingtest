package space.barkingdog.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class P5397_WIP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            LinkedList<Character> list = new LinkedList<Character>();
            String input = br.readLine();
            ListIterator<Character> listIter = list.listIterator();
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '<') {
                    if (listIter.hasPrevious())
                        listIter.previous();
                } else if (input.charAt(j) == '>') {
                    if (listIter.hasNext())
                        listIter.next();
                } else if (input.charAt(j) == '-') {
                    if (listIter.hasPrevious()) {
                        //지우려고 볼때, listIter 의 위치가 null 이라서 iter를 새로 불러와야하는데, 커서 위치를 알 수 없음.
                        // asdf 가 되어있을때 << 후 - 면 s를 제거해야하는데, 커서 위치를 어떻게 기억하나..?
                        list.remove(listIter.previousIndex());
                        listIter.previous();
                    }
                } else {
                    listIter.add(input.charAt(j));
                }
            }
            for (Character c : list) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
