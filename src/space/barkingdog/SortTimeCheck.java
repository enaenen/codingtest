package space.barkingdog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class SortTimeCheck {
    public static void sortingInteger(int[] arr){
        long beforeTime = System.nanoTime();
        Arrays.sort(arr);
        long afterTime = System.nanoTime();
        long diffSec = afterTime - beforeTime;
        System.out.println("diff = " + diffSec);

    }
    public static void sortingString(String[] arr){
        long beforeTime = System.nanoTime();
        Arrays.sort(arr);
        long afterTime = System.nanoTime();
        long diffSec = afterTime - beforeTime;
        int[] ints = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        System.out.println("diff = " + diffSec);

    }
    public static int randomIntGenerator(){
        int min = 10;
        int max = 100;
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int[] ints = Arrays.stream(inputs).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(ints);
        for (Integer a : ints){
            System.out.print(a + " ");
        }
/*
        int[] arr = new int[1000000]; //= new int[] {3, 2,1};
        String[] strings = new String[1000000]; //= new String[] {"3","2","1"};
        for (int i = 0; i <1000000; i++){
            arr[i] = randomIntGenerator();
            strings[i] = String.valueOf(arr[i]);
        }

        sortingString(strings);
        sortingInteger(arr);
//        for (String string : strings) {
//            System.out.print(string + " ");
//        }
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
*/
 }


}
