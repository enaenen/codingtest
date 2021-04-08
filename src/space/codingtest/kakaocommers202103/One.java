package space.codingtest.kakaocommers202103;

import java.util.HashMap;

public class One {
    public static void main(String[] args) {
        int[] gift_cards1 = new int[]{4, 5, 3, 2, 1};
        int[] gift_cards2 = new int[]{5, 4, 5, 4, 5};

        int[] wants1 = new int[]{2, 4, 4, 5, 1};
        int[] wants2 = new int[]{1, 2, 3, 5, 4};

        System.out.println(solution(gift_cards1, wants1));
        System.out.println(solution(gift_cards2, wants2));
    }

    public static int solution(int[] gift_cards, int[] wants) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int gc : gift_cards)
            map.put(gc, map.getOrDefault(gc, 0) + 1);

        for (int i = 0; i < wants.length; i++) {
             if(map.get(wants[i]) == null || map.get(wants[i])==0)
                 answer++;
             else
                 map.put(map.get(wants[i]),map.get(wants[i])-1);
        }
        return answer;
    }
}
