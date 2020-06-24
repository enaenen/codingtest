package jooeun.programmers;

import java.util.*;

public class Truck {

    static public void main(String[] args){

        int bridge_length = 2 ;
        int weight = 10;
        int[] truck_weights = new int[]{7,4,5,6};

        int answer = solution(bridge_length,weight,truck_weights);

        System.out.println(answer);

    }

    static public int solution(int bridge_length, int weight, int[] truck_weights) {

        int time = 0;
        int total_w = 0 ;

        //
        Queue<Truck_Info> waiting = new LinkedList<Truck_Info>();
        Queue<Truck_Info> bridge = new LinkedList<Truck_Info>();

        for(int i = 0 ; i < truck_weights.length ; i++){
            waiting.add(new Truck_Info(truck_weights[i],0));
        }

        while(!waiting.isEmpty() || !bridge.isEmpty()){

            time++;

            //다리를 지나고 있는 트럭이 있을 때
            if(!bridge.isEmpty()){

                Truck_Info truck = bridge.peek();

                //다리를 다 지나갔는지 체크
                if(time - truck.cross_time == bridge_length){
                    total_w -= truck.weight;
                    bridge.poll();
                }
            }

            //대기중인 트럭이 있을 때
            if(!waiting.isEmpty()){

                //다리가 버틸 수 있는 중량 이하일 경우
                if(total_w + waiting.peek().weight <= weight){

                    Truck_Info truck = waiting.poll();
                    truck.cross_time = time;
                    total_w += truck.weight;

                    bridge.add(truck);
                }
            }

        }


        return time;
    }
}

class Truck_Info{
    int weight;
    int cross_time;

    public Truck_Info(){;}

    public Truck_Info(int weight, int cross_time){

        this.weight = weight;
        this.cross_time = cross_time;

    }
}

