package space.barkingdog.deque;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class P5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tests = Integer.parseInt(br.readLine());
        while (0 < tests--) {
            StringBuilder sb = new StringBuilder();
            String cmd = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String[] nums = br.readLine().replace("[", "").replace("]", "").split(",");
            LinkedList<String> list = new LinkedList<String>();
            boolean isError = false;
            for (String num : nums)
                list.add(num);

            for (char i : cmd.toCharArray()) {
                if (i == 'R') {
                    Collections.reverse(list);
                } else if (i == 'D') {
                    //배열이 0이고, 삭제를 연산한 경우
                    if (list.isEmpty()) {
                        sb.append("error\n");
                        break;
                    }
                    list.removeFirst();
                }
            }

            if (!list.isEmpty()) {
                sb.append("[");
                for (String str : list) {
                    sb.append(str);
                    sb.append(",");
                }
                sb.deleteCharAt(sb.length() - 1);
                sb.append("]");
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }
    }
}
