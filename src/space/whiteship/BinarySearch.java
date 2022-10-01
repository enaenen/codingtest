package space.whiteship;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {1000, 28, 99, 10, 5, 1, 2, 3,4};
        Arrays.sort(arr);
        System.out.println(solution( arr,10));
    }

    public static int solution(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int idx = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midNumber = arr[mid];
            System.out.println("midnumber = " + midNumber);
            if (midNumber < target)
                low = mid + 1;
            else if (target < midNumber)
                high = mid - 1;
            else if (target == midNumber) {
                idx = mid;
                break;
            }
        }
        return arr[idx];
    }
}
