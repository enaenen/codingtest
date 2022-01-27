package space;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;

public class SandBox {
    public static void main(String[] args) {
        HashMap<String, String> mapTest = new HashMap<>();

        mapTest.put("xx",null);
        mapTest.put("YY","2");

        System.out.println(mapTest.get("XX"));
        System.out.println(mapTest.get("YY"));
    }
}
