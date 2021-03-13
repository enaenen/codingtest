package jooeun.codingtest.배민;

public class Solution1 {

    public static void main(String[] args){
        int money = 15000;
        for(int i : solution(money)){
            System.out.print(i + "   ");
        }
    }

    public static int[] solution(int money){

        int[] m_unit = {50000,10000,5000,1000,500,100, 50,10,1};
        int[] answer = new int[m_unit.length];

        for(int i = 0 ; i < m_unit.length; i++){
            answer[i] = money/m_unit[i];
            money -= answer[i]*m_unit[i];
        }

        return answer;
    }

}
