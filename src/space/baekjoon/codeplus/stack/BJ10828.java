package space.baekjoon.codeplus.stack;

import java.io.*;

public class BJ10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] stack = new int[n];
        int size=0;

        while(n-- > 0){
            String[] cmd = br.readLine().split(" ");
            if(cmd[0].equals("push")){
                int inputNumber = Integer.parseInt(cmd[1]);
                stack[size]=inputNumber;
                size++;
            }
            else if (cmd[0].equals("top")){
                if(size<=0){
                    bw.write("-1\n");
                    continue;
                }
                bw.write(stack[size-1]+"\n");
            }
            else if (cmd[0].equals("size")){
                bw.write(size+"\n");
            }
            else if(cmd[0].equals("empty")){
                if(size<=0){
                    bw.write("1\n");
                    continue;
                }
                bw.write("0\n");
            }
            else if(cmd[0].equals("pop")){
                if(size<=0){
                    bw.write("-1\n");
                    continue;
                }
                bw.write(stack[size-1]+"\n");
                size--;
            }

        }
        bw.flush();
    }
}
