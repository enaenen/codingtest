package space.programmers.lv0;

public class GiyakBoonsu {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;

        System.out.println(n1 * n2 / gcd(n1,n2));
    }

    private static int gcd(int n1, int n2) {
        if (n1 % n2 == 0)
            return n2;
        return gcd(n2, n1 % n2);
    }
}
