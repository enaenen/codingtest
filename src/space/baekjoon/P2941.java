/*
    두글자를 한글자로 바꾸어 카운팅을 하자
 */
package space.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2941 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String[] croatian = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String input = br.readLine().trim();
        for(String check : croatian){
            if(input.contains(check))
                input=input.replaceAll(check,"X");
        }
        System.out.println(input.length());

    }
}
