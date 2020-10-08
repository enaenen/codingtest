package jooeun.codingChallange.season1;

import java.util.*;

public class Solution3 {

    static ArrayList<B> list_copy;

    static public void main(String[] args){

        int[] a = {-16,27,65,-2,58,-92,-71,-68,-61,-33};

        System.out.println("ANSWER : " + solution(a));

    }

    static int solution(int[] a){

        ArrayList<B> list = new ArrayList<B>();
        list_copy = list;

        for(int i = 0; i < a.length ; i++){
            list.add(new B(i,a[i]));
        }

        dfs(0,0,false);

        return 0;
    }

    static void dfs(int cnt, int answer, boolean smallNum){



    }

}
class B{

    int idx;
    int num;

    public B(){}

    public B(int idx, int num){
        this.idx = idx;
        this.num = num;
    }

}
