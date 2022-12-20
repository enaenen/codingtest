package space.programmers.level1;

public class RootAndPow {
    public static void main(String[] args) {
        int n = 4;
        double root = Math.sqrt(121);
        if (root % 1 == 0){
            long pow = (long) Math.pow(root + 1, 2);
            System.out.println(pow);
        }
        else{
            System.out.println(-1);
        }
    }
}
