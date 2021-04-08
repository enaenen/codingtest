package space.testchamber;

public class StringIndexOf {
    public static void main(String[] args) {
        String str = "abc";
        //지정한 char의 위치를 string의 몇번째에 있는지 0부터 시작한 index 반환
        System.out.println(str.indexOf('c'));
        //없을땐 -1 출력
        System.out.println(str.indexOf(-10));
    }
}
