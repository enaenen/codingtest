package jooeun.codingtest.gabia2021;

public class Solution3 {

    public static void main(String[] args){
        int N = 3;
        int[] coffee_times = {1, 1, 1, 1, 4};

        for(int i : solution(N, coffee_times))
            System.out.print(i +"  ");
    }

    public static int[] solution(int N, int[] coffee_times){

        int[] answer = new int[coffee_times.length];

        if(N == 1){

            for(int i = 1; i <= coffee_times.length; i++)
                answer[i-1] = i;
            return answer;
        }

        int[] coffee_machine = new int[N];
        int[] coffee_index = new int[N];
        int min_coffee_time;
        int answer_idx = 0;
        int last_coffee_index = 0;  //바로 커피 넣으면 됨
        // 초기화
        for(int i = 0 ; i < N; i++){
            coffee_index[i] = i + 1;
            coffee_machine[i] = coffee_times[i];

            if(i == N - 1)
                last_coffee_index = i;
        }

        while(answer_idx < coffee_times.length){

            min_coffee_time = Integer.MAX_VALUE;

            // 제일 짧은 coffee time 구하기
            for(int i = 0 ; i < N; i++) {
                if (min_coffee_time > coffee_machine[i]&& coffee_machine[i] != -1)
                    min_coffee_time = coffee_machine[i];
            }

            for(int i = 0 ; i < N; i++){

                if(min_coffee_time == coffee_machine[i]){

                    answer[answer_idx++] = coffee_index[i];

                    if(last_coffee_index < coffee_times.length - 1){
                        coffee_machine[i] = coffee_times[last_coffee_index + 1];
                        coffee_index[i] = last_coffee_index + 2;
                        last_coffee_index++;
                    }else{
                        coffee_machine[i] = -1;
                    }
                }else{
                    if(coffee_machine[i] != -1)
                        coffee_machine[i] -= min_coffee_time;
                }

            }
        }

        return answer;
    }

}

//class Coffee implements Comparable<Coffee>{
//
//    int num;
//    int time;
//
//    public Coffee(){}
//
//    public Coffee(int num, int time){
//        this.num = num;
//        this.time = time;
//    }
//
//    public int compareTo(Coffee c){
//
//        if(this.time > c.time){
//
//        }
//
//    }
//
//}
