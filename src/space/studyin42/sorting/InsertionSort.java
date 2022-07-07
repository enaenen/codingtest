package space.studyin42.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {9,4,8,7,3,1,2,0,5,6};

        for (int i = 0; i < arr.length; i++){
            for (int j = i; 0 < j; j--){
                if (arr[j] < arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j - 1] = tmp;
                }
                else
                    break;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
