package space.testchamber;

/**
 * 정규표현식 테스트
 */
public class RegExTest {
    public static void main(String[] args) {
        // 문자열에서 abc 를 제외한 문자를 제거
        String test = "a x bxekmcmekd";
        test.replaceAll("[^a]|[^b]|[^c]","");
        System.out.println(test);

    }
}
