package space.programmers.level1;

public class PandY {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }

    static boolean solution(String s) {
        boolean answer = true;
        char[] chars = s.toCharArray();
        int pCount = 0;
        int yCount = 0;
        for (char character : chars) {
            if (character == 'p' || character == 'P')
                pCount++;
            else if(character=='y' || character=='Y')
                yCount++;
        }
        if(pCount!=yCount)
            answer=false;
        return answer;
    }
}
