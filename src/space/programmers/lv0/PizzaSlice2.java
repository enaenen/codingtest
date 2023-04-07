package space.programmers.lv0;

public class PizzaSlice2 {
        public static int solution(int n) {
            int pizza = 1;
            while (true){
                int slice= 6 * pizza;
                System.out.println("slice =" + slice);
                System.out.println("slice % n =" + slice % n);
                if (slice % n == 0)
                    break;
//                System.out.println(n);
                ++pizza;
            }
            return pizza;
        }
    public static void main(String[] args) {
            solution(10);
    }
}
