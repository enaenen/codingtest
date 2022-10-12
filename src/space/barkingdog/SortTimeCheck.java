package space.barkingdog;

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
        System.out.println("diff = " + diffSec);

    }
    public static int randomIntGenerator(){
        int min = 10;
        int max = 100;
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String[] args) {

        int[] arr = new int[3];
        String[] strings = new String[3];
        for (int i = 0; i <3; i++){
            arr[i] = randomIntGenerator();
            strings[i] = String.valueOf(arr[i]);
        }
        sortingString(strings);
        sortingInteger(arr);

    }
}
