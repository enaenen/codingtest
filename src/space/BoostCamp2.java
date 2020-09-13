package space;

import java.util.ArrayList;

public class BoostCamp2 {
    public static void main(String[] args){
        solution(new int[] {1,2,3,2},new int[] {1,3});
    }
        public static int[] solution(int[] arrayA, int[] arrayB) {
            int[] answer = {};
            ArrayList<Integer> setA = new ArrayList<Integer>();
            for (int i = 0; i < arrayA.length; i++) {
                if (!setA.contains(arrayA[i])) {
                    setA.add(arrayA[i]);
                }
            }

            return answer;
        }
}
