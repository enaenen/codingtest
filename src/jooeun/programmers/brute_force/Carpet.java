package jooeun.programmers.brute_force;

public class Carpet {

    static int hor = 0;
    static int ver = 0;
    static int brown;
    static int red ;

    public static void main(String[] args){

        //[4,3]
        int brown = 10;
        int red = 2;

        //[3,3]
//        int brown = 8;
//        int red = 1;

        //[8,6]
//        int brown = 24;
//        int red = 24;

        int[] result = Carpet.solution(brown,red);

        System.out.println("[" + result[0] + ", " + result[1] + "]");

    }

    static public int[] solution(int brown, int red) {


        dfs(0,0);
        Carpet.brown = brown;
        Carpet.red = red;

        return new int[]{hor, ver};
    }

    static private void dfs(int hor, int ver){

        //기저사례

    }

}
