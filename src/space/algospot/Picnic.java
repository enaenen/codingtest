package space.algospot;

import java.util.Scanner;
//입력 TC
//숫자 수 , 짝의 수
//학생들 짝의 조합
public class Picnic {

    public static boolean taken[];
    public static boolean areFriends[][];
    public static int student,cases;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();

        while(tc-- > 0){
            student = sc.nextInt();
            cases = sc.nextInt();
            areFriends = new boolean[student][student];
            taken = new boolean[student];
            for(int i=0;i<cases;i++){
                int one = sc.nextInt();
                int two = sc.nextInt();
                areFriends[one][two] =true;
                areFriends[two][one] =true;
            }
            System.out.println(DFS());
        }

    }
    public static int DFS(){
        //탈출조건
        int isFinished = -1;
        for(int i=0;i<student; i++){
            if(!taken[i]){
                isFinished=i;
                break;
            }
        }
        if(isFinished==-1){
            return 1;
        }



        return 0;
    }
}
