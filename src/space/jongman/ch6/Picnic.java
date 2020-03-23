/*
https://algospot.com/judge/problem/read/PICNIC

입력

3
2 1
0 1
4 6
0 1 1 2 2 3 3 0 0 2 1 3
6 10
0 1 0 2 1 2 1 3 1 4 2 3 2 4 3 4 3 5 4 5


출력
1
3
4

 */

package jongman.ch6;

import java.util.Scanner;

public class Picnic {
    private static int n;
    private static int m;

    private static boolean areFriends[][];
    //private static boolean taken[];


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();

        while(tc-- > 0){
            //학생 수
            n=sc.nextInt();
            //짝의 수
            m=sc.nextInt();

            areFriends = new boolean[n][n];
            boolean[] taken = new boolean[n];

            while(m-- >0){
                int p = sc.nextInt();
                int q = sc.nextInt();

                areFriends[p][q] = true;
                //대칭이므로(하나만하면 결과가 제대로안나옴)
                areFriends[q][p] = true;
            }

            System.out.println(countPairings(taken));
        }

    }

    private static int countPairings(boolean taken[]){
        int firstFree=-1;
        //짝을 찾지 못한 학생이 있는 체크
        //짝을 못찾은 학생 중 가장 앞번호를 대입
        //기저사례(탈출조건)
        for(int i=0;i<n;i++) {
            if (!taken[i]) {
                firstFree = i;
                break;
            }
        }
        // 없으면 리턴 탈출조건 완성
        if(firstFree==-1)
            return 1;

        //여기까지 왔다는것은 짝을 찾지 못한 p번재 학생이 있다
        //따라서 학생의 짝을 찾아준다.
        int ret = 0;

        for(int pairWith=firstFree+1;pairWith<n;pairWith++){
            if(!taken[pairWith]&&areFriends[firstFree][pairWith]){
                taken[firstFree] = taken[pairWith] = true;
                ret += countPairings(taken);
                taken[firstFree]=taken[pairWith]=false; //다음 모든 경우의 수를 검색해야하기때문에 false로 해줌
            }
        }
        return ret;
    }
}