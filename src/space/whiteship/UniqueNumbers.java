package space.whiteship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 1, 2, 3, 3, 4, 4, 5, 5};
        System.out.println(solution1(arr1));
        System.out.println(solution2(arr1));
        System.out.println(solution3(arr1));
//        int[] arr2 = new int {1,1,2,3,0,4,4,5,5};
    }

    //This is O(n^2)
    //Capacity : O(n)
    public static int solution1(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int n : arr) {
            if (!list.contains(n)) // Contains method 는 list를 순회한다. 따라서 O(n) * O(n)
                list.add(n);
            else
                list.remove((Integer) n);
        }
        return list.get(0);
    }

    // Hashmap Get == O(1) + iteration O(n) => O(n)
    // Capacity Complex == O(n)
    //
    public static int solution2(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            //O(n) + O(n) = O(2n) => O(n)
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : arr) {
            if (map.get(n) == 1)
                return (n);
        }
        return (0);
    }

    //XOR
    // 5 = 101
    // 0 = 000
    // XOR 101
    // XOR
    // => 1 -> 0
    // => 0 -> 1

    // 0 ^ n = N
    // N ^ N = 0
    //
    //O(N)
    //O(1) => 고정적 변수 1개
    public static int solution3(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }

}
