package space.codingtest.kakao.intern210508;

import java.util.LinkedList;
import java.util.Stack;

public class P3 {
    public static void main(String[] args) {

    }
    public static String solution(int n, int k, String[] cmd) {
        String answer = "";
        int currentLine = k;
        int[] table = new int[n];
        Stack<Integer> deleted = new Stack<Integer>();

        for(int i=0;i<cmd.length;i++){
           String[] command = cmd[i].split(" ");
           if(command[0].equals("U"))
               currentLine -= Integer.parseInt(command[1]);

           if(command[0].equals("D"))
               currentLine += Integer.parseInt(command[1]);

           if(command[0].equals("C")){
               deleted.push(table[currentLine]);
               table[currentLine] = 0;
               if(currentLine+1 > n)
                   currentLine--;
               else
                   currentLine++;
           }

           if(command[0].equals("Z")){

           }
        }

        return answer;
    }
}
