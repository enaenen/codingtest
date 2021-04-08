//package space.lecture.jongman.ch6;
//
//import java.io.*;
//import java.nio.charset.Charset;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Boggle {
//    static char[][] board = new char[5][5];
//    static final int[] dx = {-1,-1,-1,1,1,0,0};
//    static final int[] dy = {-1,0,1,-1,0,1,-1,1};
//
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int tc = Integer.parseInt(br.readLine());
//        while(tc-- > 0){
//            for(int i=0;i<5;i++){
//                String str = br.readLine();
//                board[i] = str.toCharArray();
//            }
//        }
//        int nWord = Integer.parseInt(br.readLine());
//        while(nWord-- > 0){
//            String word = br.readLine();
//            String result="NO";
//            for(int y)
//        }
//
//    }
//}
