package space.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Bridge {
    private class Truck{
        public int entryTime;
        public int weight;

        public Truck(int weight, int entryTime){
            this.weight=weight;
            this.entryTime=entryTime;
        }

    }
    public static void main(String[] args){

        System.out.println(new Bridge().solution(2,10, new int[] {7,4,5,6}));
        System.out.println(new Bridge().solution(100,100, new int[] {10}));
        System.out.println(new Bridge().solution(100,100, new int[] {10,10,10,10,10,10,10,10,10,10}));

    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int second=0;
        int currentBridgeWeight=0;
        //대기줄
        Queue<Truck> waiting = new LinkedList<Truck>();
        //다리 위 상황
        Queue<Truck> onBridge = new LinkedList<Truck>();

        for(int i=0;i<truck_weights.length;i++){
            waiting.offer(new Truck(truck_weights[i],0));
        }
        //기다리는 트력이 없고 다리도 비어야함
        while(!waiting.isEmpty() || !onBridge.isEmpty() ){
            second++;

            //다리에서 나와서 지나감처리
            //이걸 먼저하지않으면 지나간 무게를 안빼기 때문에 초가 더 걸림
            if(!onBridge.isEmpty()){
                //들어간 시간이 다리길이보다 짧을때
                if(second-onBridge.peek().entryTime>=bridge_length) {
                    currentBridgeWeight-=onBridge.poll().weight;
                }
            }

            //대기열에서 다리로 꺼내기
            if(!waiting.isEmpty()) {
                //현재 다리의 무게 + 지나갈 트럭의 무게 <= 수용가능 무게
                if (currentBridgeWeight + waiting.peek().weight <= weight) {
                    Truck t = waiting.poll();
                    currentBridgeWeight += t.weight;
                    onBridge.offer(new Truck(t.weight, second));
                }
            }
        }

        return second;
    }
}
