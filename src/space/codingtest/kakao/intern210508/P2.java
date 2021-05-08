package space.codingtest.kakao.intern210508;

public class P2 {
    public static void main(String[] args) {
        solution(new String[][] {
                        {"POOOP",
                        "OXXOX",
                        "OPXPX",
                        "OOXOX",
                        "POXXP"}});
    }
    public static int[] solution(String[][] places) {
        int[] answer = {};
        char[][] map = new char[5][5];
        for (int i=0;i<places.length;i++){
            for(int j=0;j<places[0].length;j++){
                map[j] = places[i][j].toCharArray();
            }
        }

        for (char[] chars : map) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }

        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[0].length;j++){

            }
        }
        return answer;
    }

}
