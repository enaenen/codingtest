package space;

import java.util.Calendar;

public class SandBox {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, 2000);
        System.out.println(c.getTime());
    }
}
