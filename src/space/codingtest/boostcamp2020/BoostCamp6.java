package space.codingtest.boostcamp2020;


public class BoostCamp6 {
    public static void main(String[] args){
        int[] x = solution(new int[] {1,2,3,3,3,3,4,4});
        for(int a : x){
            System.out.println(a);
        }
        return;
    }
    public static int[] solution(int[] arr){
        int[] temp = new int[101];
        int cnt=0;
        int[] answer;

        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }

        if(cnt==0){
            answer = new int [1];
            answer[0]=-1;
            return answer;
        };

        answer = new int[cnt];
        cnt=0;
        for(int i=0;i<temp.length;i++){

            if(temp[i]>1){
                answer[cnt]=temp[i];
                cnt++;
            }
        }

        return answer;
    }
}
