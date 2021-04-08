package space.kakaocommers;

import java.util.HashMap;

public class TestChamber {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,10);

        System.out.println(map.get(20));
    }
}
