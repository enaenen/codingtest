package space.barkingdog.deque;

import java.io.*;
import java.util.*;

public class P5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tests = Integer.parseInt(br.readLine());
        while (0 < tests--) {
            StringBuilder sb = new StringBuilder();
            String cmd = br.readLine();
            int n = Integer.parseInt(br.readLine());
            if (n < 1) {
                bw.write("error\n");
                bw.flush();
            } else {
                String[] nums = br.readLine().replace("[", "").replace("]", "").split(",");
                Deque<String> deq = new LinkedList<String>();
                for (String num : nums) {
                    if (num.length() == 0)
                        break;
                    deq.add(num);
                }
                boolean reverse = false;
                boolean isError = false;

                for (char i : cmd.toCharArray()) {
                    if (i == 'R') {
                        reverse = !reverse;
                    } else if (i == 'D') {
                        //배열이 0이고, 삭제를 연산한 경우
                        if (deq.isEmpty()) {
                            bw.write("error\n");
                            isError = true;
                            break;
                        }
                        if (reverse)
                            deq.removeLast();
                        else
                            deq.removeFirst();
                    }
                }
                if (!isError) {
                    sb.append("[");
                    while (!deq.isEmpty()) {
                        if (reverse)
                            sb.append(deq.removeLast());
                        else
                            sb.append(deq.remove());
                        sb.append(",");
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append("]\n");
                }
                bw.write(sb.toString());
                bw.flush();
            }
        }
    }
}
