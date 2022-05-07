package space.codingtest.kakao.intern2022;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P2 {
    public static void main(String[] args) {
//        int[] queue1 = {1,2,3,4,5};
//        int[] queue2 = {5,4,3,2,1};
        int[] queue1 = {1, 1};
        int[] queue2 = {1, 5};
        System.out.println(solution(queue1, queue2));
    }

    public static long sumOfQueue(Queue<Integer> queue) {
        long sum = 0;
        for (Integer n : queue) {
            sum += n;
        }
        return sum;
    }

    public static int solution(int[] queue1, int[] queue2) {
        //limit 에 대한 고려 필요 *2 를 안해서 1번에서 계속 튕겻음
        long limit = queue1.length + queue2.length;
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        long cnt = 0;
        long sumOfQ1 = Arrays.stream(queue1).sum();
        long sumOfQ2 = Arrays.stream(queue2).sum();
        if ((sumOfQ1 + sumOfQ2) % 2 != 0)
            return -1;
        while (sumOfQ1 != sumOfQ2) {
            if (sumOfQ1 < sumOfQ2) {
                sumOfQ1 += q2.peek();
                sumOfQ2 -= q2.peek();
                q1.add(q2.poll());
            }
            else if (sumOfQ2 < sumOfQ1){
                sumOfQ1 -= q1.peek();
                sumOfQ2 += q1.peek();
                q2.add(q1.poll());
            }
            cnt++;
            if (limit * 2 < cnt) {
                cnt = -1;
                break;
            }
        }
        return (int)cnt;
    }
}
