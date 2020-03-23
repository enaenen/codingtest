package space.programmers.kakao;
import java.util.HashMap;
import java.util.Map;

public class Level4 {
    public static void main(String[] args) {
        long k = 10;
        long[] room_number = {1, 3, 4, 1, 3, 1};
        solution(k, room_number);
        for(long a : solution(k,room_number)){
            System.out.println(a);
        };
    }

    public static long[] solution(long k, long[] room_number) {
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        long[] answer = new long[room_number.length];
        for (int i = 0; i < room_number.length; i++) {
            if (map.get(room_number[i]) != null) {
                while (true) {
                    room_number[i] += 1;
                    if(map.get(room_number[i])==null)
                        break;
                }
                map.put(room_number[i], 1);
                answer[i] = room_number[i];
            } else {
                map.put(room_number[i], 1);
                answer[i] = room_number[i];
            }
        }
        return answer;
    }
}