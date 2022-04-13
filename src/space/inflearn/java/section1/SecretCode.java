package space.inflearn.java.section1;

import java.util.Scanner;

public class SecretCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordCnt = sc.nextInt();
        String code = sc.next();
        String binaryCode = code.replaceAll("[#]", "1").replaceAll("[*]", "0");

        for (int i = 0; i < wordCnt; i++){
            String tmp = binaryCode.substring(0, 7);
            int num = Integer.parseInt(tmp, 2);
            binaryCode = binaryCode.substring(7);
            System.out.print((char)num);
        }
    }
}
