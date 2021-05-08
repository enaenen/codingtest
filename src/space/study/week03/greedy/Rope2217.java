    package space.study.week03.greedy;
    /**
     * 21-04-16
     * Greedy
     * Test
     * 5
     * 35
     * 33
     * 30
     * 20
     * 12
     */

    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.Arrays;
    import java.util.Collections;

    public class Rope2217 {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine());
            Integer ropes[] = new Integer[input];

            for (int i = 0; i < input; i++)
                ropes[i] = Integer.parseInt(br.readLine());

            Arrays.sort(ropes, Collections.reverseOrder());
            int maxW = 0;
            for (int i = 1; i <= ropes.length; i++) {
                int w = ropes[i - 1] * i;
                if (maxW < w)
                    maxW = w;
            }
            System.out.println(maxW);
        }
    }
