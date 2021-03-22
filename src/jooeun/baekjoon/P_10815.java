package jooeun.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P_10815 {

    public static void main(String[] args)throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//        int len1 = Integer.parseInt(st.nextToken());
//
//        int[] ary1 = new int[len1];
//        st = new StringTokenizer(br.readLine());
//        for(int i = 0 ; i < len1 ; i++) {
//            ary1[i] = Integer.parseInt(st.nextToken());
//        }
//
//        st = new StringTokenizer(br.readLine());
//        int len2 = Integer.parseInt(st.nextToken());
//
//        st = new StringTokenizer(br.readLine());
//        int[] ary2 = new int[len2];
//        for(int i = 0 ; i < len2 ; i++) {
//            ary2[i] = Integer.parseInt(st.nextToken());
//        }

        int len1 = 5;
        int len2 = 8;
        int[] ary1 = {6, 3, 2, 10, -10};
        int[] ary2 = {10, 9, -5, 2, 3, 4, 5, -10};

        int[] answer = solution(len1, ary1, len2, ary2);

        StringBuilder sb = new StringBuilder();
        for(int i : answer)
            sb.append(i + " ");

        System.out.println(sb.toString());
    }

    public static int[] solution(int len1, int[] ary1, int len2, int[] ary2){

        // 이분 탐색을 위한 오름차순 sort
        Arrays.sort(ary1);

        int[] answer = new int[len2];
        int start ,end , mid;

        for(int i = 0 ; i < len2; i++){

            start = 0;
            end = len1- 1;
            mid = (start + end)/2;

            while((end - start) >= 0){

                switch(compare(ary2[i], ary1[mid])){
                    case 0 : break;
                    case 1 : start = mid + 1; break;
                    case -1 : end = mid - 1; break;
                }

                if(ary1[mid] == ary2[i]) {
                    answer[i] = 1;
                    break;
                }

                mid = (end + start)/2;
            }
        }

        return answer;
    }

    private static int compare(int n1, int n2){
        if(n1 == n2)
            return 0;
        else if(n1 < n2)
            return -1;
        else
            return 1;
    }

}
