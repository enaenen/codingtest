package jooeun.help;

public class BinarySearch {

    static public void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = -1;
        int answer = binary_Search(arr, key);

        System.out.println(key + "값의 인덱스는 ? " + answer);

    }

    static int binary_Search(int arr[], int key){

        int mid = arr.length / 2;
        int mid_before = -1;
        int result = -1;

        while(mid_before != mid){

            mid_before = mid;

            switch(compare(arr[mid], key)){

                //같을 경우
                case 0 : result = mid; break;
                //클 경우
                case 1 : mid += (arr.length - mid)/2;   break;
                //작을 경우
                case -1 : mid /= 2;   break;

            }

            if(result == mid){
                break;
            }

        }

        return result;
    }

    static int compare(int num, int key){

        int result = 0;

        if(key > num){
            result = 1;
        }else if(key < num){
            result = -1;
        }

        return result;
    }

}
