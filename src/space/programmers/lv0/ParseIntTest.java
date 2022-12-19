package space.programmers.lv0;

public class ParseIntTest {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
//        System.out.println(Integer.parseInt(my_string));
        my_string = my_string.replaceAll("[^0-9]","");
        System.out.println("my_string = " + my_string);
    }
}
