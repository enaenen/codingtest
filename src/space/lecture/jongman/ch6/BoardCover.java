/*
https://algospot.com/judge/problem/read/BOARDCOVER

예제 입력
3
3 7
#.....#
#.....#
##...##
3 7
#.....#
#.....#
##..###
8 10
##########
#........#
#........#
#........#
#........#
#........#
#........#
##########


예제 출력
0
2
1514
 */
package space.lecture.jongman.ch6;

import java.util.Scanner;

public class BoardCover {
    //3칸을 차지하는 블럭이 나올 수 있는 모든 경우의 수 (4가지)
    //시작하는 칸은  0,0
    private static int[][][] coverType = {
            {{0,0},{0,1},{1,1}}, //ㄱ
            {{0,0},{1,0},{1,1}}, //ㄴ
            {{0,0},{0,1},{1,0}}, //ㄱ 반전
            {{0,0},{1,0},{1,-1}} //ㄴ 반전
    };
    private static int board[][];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int width, height;
        char[] array_word;

        while(tc-- > 0){
            height = sc.nextInt();
            width = sc.nextInt();
            board = new int[height][width];
            for(int i=0;i<height;i++){
                //엔터값, 띄어쓰기값 제거
                String line = sc.next().trim();
                //한줄씩 String으로 읽어서 char로 한글자씩 읽어서 1과 0으로 보드생성
                array_word = new char[line.length()];
                for(int j=0;j<array_word.length;j++){
                    if(line.charAt(j)=='#'){
                        board[i][j]=1;
                    }else if(line.charAt(j)=='.'){
                        board[i][j]=0;
                    }//엔터가 들어가므로 else if
                }

            }
            //출력

//            for(int i=0;i<height;i++){
//                for(int j=0;j<width;j++){
//                    System.out.print(board[i][j]);
//                }
//                System.out.println("");
//            }


            System.out.println(cover());

        }


        return;
    }
    public static int cover(){

        int x=-1,y=-1;
        for(int i=0;i<board.length;i++) {
            for (int j = 0; j < board[i].length; j++) {
                // 블럭이 들어갈 수 있는 자리라면
                // 들어갈 수 있는 보드의 x,y 인덱스 저장
                if (board[i][j] == 0) {
                    y = i;
                    x = j;
                    break;
                }
            }
            // y를 돌면서 -1이 유지된게 아니라면 어딘가 0을 찾았으니 인덱스값 유지를 위해 break
            if (y != -1) {
                break;
            }
        }
        //기저사례 (보드를 다 채웠다면 경우의 수 한가지 찾음-> 리턴)
        if(y==-1) return 1;

        int ret=0;
        //4가지 경우의 수로 블럭 채우기
        for(int type=0;type<4;type++){
            if(set(y, x, type, 1)) {
                ret += cover();
            }
            set(y, x, type, -1);
        }
        return ret;
    }
    public static boolean set(int y, int x, int type, int delta){
        boolean ok=true;
        for(int i=0;i<3;i++){
            int ny = y + coverType[type][i][0];
            int nx = x + coverType[type][i][1];
            // ny, nx 가 board의 범위안에 있는지 체크
            if(ny < 0 || ny >= board.length || nx < 0 || nx >= board[0].length){
                ok = false;
                //블럭 채우기 혹은 지우기
            }else if((board[ny][nx] += delta) > 1){
                ok = false;
            }
        }
        return ok;
    }
}
