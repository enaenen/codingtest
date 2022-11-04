package space.barkingdog.deque;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class P1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] caseInput = br.readLine().split(" ");
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i < Integer.parseInt(caseInput[0]) + 1;++i){
            list.add(i);
        }
        int answer = 0;
        int cnt = Integer.parseInt(caseInput[1]);
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int num : nums) {
            int idx = list.indexOf(num);
            if (idx <= list.size() / 2)
            {
                while (num != list.getFirst()){
                    list.add(list.removeFirst());
                    answer++;
                }
                list.removeFirst();
            }
            else{
                while (num != list.getFirst()){
                    list.addFirst(list.removeLast());
                    answer++;
                }
                list.removeFirst();
            }
        }
        System.out.println(answer);
    }
}
