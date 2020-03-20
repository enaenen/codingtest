package jongman.ch6;

import java.util.Scanner;

public class BoardCover {
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
                String line = sc.next().trim();
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
                if (board[i][j] == 0) {// 블럭이 들어갈 수 있는 자리라면
                    //y와 x 인덱스를 저장
                    y = i;
                    x = j;
                    break;
                }
            }
            if (y != -1) {
                break;
            }
        }
        if(y==-1) return 1;
        int ret=0;
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
            // y가 범위 안에있고, x 가 범위안에 있어야한다
            if(ny < 0 || ny >= board.length || nx < 0 || nx >= board[0].length){
                ok = false;
                //겹쳐지는 자리일때 1보다 커지므로 false(delta 가 1일때)
                //delta를 -1을 주면 이 구문은 바로 통과하므로 겹칠수 있도록 하는것
            }else if((board[ny][nx] += delta) > 1){
                ok = false;
            }
        }
        return ok;
    }
}
