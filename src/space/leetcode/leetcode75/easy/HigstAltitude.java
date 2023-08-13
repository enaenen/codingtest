package space.leetcode.leetcode75.easy;
//1732. Find the Highest Altitude
public class HigstAltitude {
    public static void main(String[] args) {
        int i = largestAltitude(new int[]{-5, 1, 5, 0, -7});
        System.out.println(i);
        i = largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2});
        System.out.println(i);
    }
    public static int largestAltitude(int[] gain) {
        int highstAltitude = 0;
        int currentAltitude = 0;
        for (int i : gain) {
            currentAltitude += i;
            highstAltitude = Math.max(highstAltitude, currentAltitude);
        }
        return highstAltitude;
    }
}
