package space.baekjoon.codeplus.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BJ1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputString = br.readLine();
        String[] inputList = inputString.split(" ");

        int size = Integer.parseInt(inputList[0]);
        int popCounter = Integer.parseInt(inputList[1]);

        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<size; i++){
            queue.add(i+1);
        }
        int counter=1;
        bw.write("<");
        while(!queue.isEmpty()){
            if(counter==popCounter){
                counter=1;
                bw.write((queue.poll()).toString());
                if(queue.isEmpty()) break;
                bw.write(", ");
            }
            else{
                counter++;
                queue.offer(queue.poll());
            }
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}
