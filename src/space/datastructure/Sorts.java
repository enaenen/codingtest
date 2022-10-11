package space.datastructure;

public class Sorts {

    public static void selectionSort(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (arr[min] < arr[i]) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
    }


    public static void insertionSort(int[] arr){
    }


    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; 0 < i; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{10, 9, 6, 7, 5, 4, 3, 2, 1};
//        selectionSort(arr);
//        insertionSort(arr);
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
