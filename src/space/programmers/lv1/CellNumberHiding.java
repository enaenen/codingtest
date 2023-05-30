package space.programmers.lv1;

public class CellNumberHiding {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number) {
        char[] charArray = phone_number.toCharArray();
        for (int i = 0 ; i < charArray.length - 4; ++i){
            charArray[i] = '*';
        }
        return String.valueOf(charArray);
    }
}
