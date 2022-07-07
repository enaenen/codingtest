package space.studyin42.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {9,4,8,7,3,1,2,0,5,6};

        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
