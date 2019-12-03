package programmers.stackandqueue;

public class PassingTruckOnBridge {
    public static void main(String[] args){
        int bridge_length1 = 2;
        int bridge_length2 = 100;
        int bridge_length3 = 100;
        int weight1 = 10;
        int weight2 = 100;
        int weight3 = 100;
        int[] truck_weights1 = {7,4,5,8};
        int[] truck_weights2 = {10};
        int[] truck_weights3 = {10,10,10,10,10,10,10,10,10};
        System.out.println(solution(bridge_length1,weight1,truck_weights1));
        System.out.println("-------------------");
        System.out.println(solution(bridge_length2,weight2,truck_weights2));
        System.out.println("-------------------");
        System.out.println(solution(bridge_length3,weight3,truck_weights3));

    }
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;


        return answer;
    }

}
