package space.programmers.kakao.Intern0509;

public class KIntern1 {
    public static void main(String[] args){
        System.out.println(solution(new int[] {1,3,4,5,8,2,1,4,5,9,5},"right"));
        System.out.println(solution(new int[] {7,0,8,2,8,3,1,5,7,6,2},"left"));
        System.out.println(solution(new int[] {1,2,3,4,5,6,7,8,9,0},"right"));
    }

    public static String solution(int[] numbers, String hand){
        String answer ="";
        int currentLeft=100;
        int currentRight=100;

        for(int i=0;i<numbers.length;i++){
            if((numbers[i]==1)||(numbers[i]==4)||(numbers[i]==7)){
                currentLeft=numbers[i];
                answer+="L";
            }
            else if((numbers[i]==3)||(numbers[i]==6)||(numbers[i]==9)){
                currentRight=numbers[i];
                answer+="R";
            }
            else{
                if(numbers[i]==0){
                    if(currentLeft==100) currentLeft=0;
                    if(currentRight==100) currentRight=0;
                }
                if(numbers[i]==8){
                    if(currentLeft==0) currentLeft=7;
                    if(currentRight==0) currentRight=9;
                }
                //if(currentLeft==0&&currentRight!=0) currentLeft+=10;
                //if(currentRight==0&&currentLeft!=0) currentRight+=10;

                int diffLeft = Math.abs(numbers[i]-currentLeft);
                int diffRight = Math.abs(numbers[i]-currentRight);


                if(diffLeft==diffRight||diffLeft+diffRight==4||diffLeft+diffRight==6){//동률의경우
                    if(hand.equals("right")){
                        answer+="R";
                        currentRight=numbers[i];
                    }
                    else{
                        answer+="L";
                        currentLeft=numbers[i];
                    }
                }
               else if(diffLeft==1||diffLeft==3||diffLeft==8){
                    answer+="L";
                    currentLeft=numbers[i];
                }
                else if(diffRight==1||diffLeft==3||diffRight==8){
                    answer+="R";
                    currentRight=numbers[i];
                }
                else{
                    if(diffLeft>diffRight){
                        answer+="R";
                        currentRight=numbers[i];
                    }
                    else{
                        answer+="L";
                        currentLeft=numbers[i];
                    }
                }

            }

        }
        return answer;
    }
}
