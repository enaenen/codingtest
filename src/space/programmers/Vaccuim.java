package space.programmers;

public class Vaccuim {
    public static void main(String[] args) {
        System.out.println(new Vaccuim().solution(new int[][] {{5,-1,4},{6,3,-1},{2,-1,1}},1,0,new String[] {"go","go","right","go","right","go","left","go"}));
    }

    public int solution(int[][] office, int r, int c, String[] move) {
        int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
        int currentDir=0;
        int answer = office[r][c];
        office[r][c]=0;
        //System.out.println(office.length);

        for(int i=0;i<move.length;i++){
            if (move[i].equals("go")) {
                int nextR = r + direction[currentDir][0];
                int nextC = c + direction[currentDir][1];
                if (nextR >= office.length || nextR < 0 || nextC >= office.length || nextC < 0 || office[nextR][nextC] == -1) {
                    continue;
                }
                answer += office[nextR][nextC];
                office[nextR][nextC] = 0;
                r = nextR;
                c = nextC;
            }
            else if (move[i].equals("left")) {
                currentDir -= 1;
                if (currentDir < 0) {
                    currentDir = 3;
                }
            }
            else {
                    currentDir += 1;
                    if (currentDir > 3) {
                        currentDir = 0;
                    }
                }
            }
        return answer;
    }
}
