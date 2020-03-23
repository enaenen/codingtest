package space.programmers.etc;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args){
        int[] arr1 = {1,3,2};
        int[] arr2 = {3,1,2};
        int[] arr4 = {3,2,1};
        int[] arr3 = {2,3,4,1};
        solution(arr3);
    }
    public static void solution(int[] arr){
        int[] checkStack =  new int[arr.length];
        Stack<Integer> stackArr = new Stack<>();
        for(int a: checkStack){
            a = 0;
        }
        for(int i=0;i<arr.length;i++){
            int cnt = arr[i];
            for(int j =1 ; j<=cnt ; j++) {
                if (checkStack[j-1] == 0){
                    stackArr.push(j);
                    checkStack[j-1] =1;
                }
            }
            if(cnt != stackArr.pop()){
                return;
            }
        }
        return;

    }

}