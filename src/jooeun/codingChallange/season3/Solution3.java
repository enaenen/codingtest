//package jooeun.codingChallange.season3;
//
//
//import java.util.*;
//
//public class Solution3 {
//
//    public static void main(String[] args){
//
//        int[] a = {8,8,3,8,7,2,8,2,2,8};
//        int answer = solution(a);
//
//        System.out.println(answer);
//
//    }
//
//    static public int solution(int[] a) {
//
//        int answer = -1;
//
//        if(a.length  < 2 ){
//            answer = 0;
//
//            return answer;
//        }
//
//        ArrayList<Num> num_list =  new ArrayList<Num>();
//        ArrayList<Integer> idx;
//        HashSet<Integer> num_set = new HashSet<Integer>();
//        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//        int cnt;
//
//        for(int i = 0 ; i < a.length; i++) {
//
//            if (num_set.contains(a[i])) {
//
//            } else {
//                cnt = 0;
//            }
//
//            hm.put(a[i], ++cnt);
//
//        }
//
//        Iterator<Integer> itr = hm.keySet().iterator();
//        Num num;
//
//        while(itr.hasNext()){
//
//            cnt = itr.next();
//            num = new Num(cnt,hm.get(cnt));
//            num_list.add(num);
//
//        }
//
//        Collections.sort(num_list);
//
//        boolean flag = true;
//
//        for(int i = 0 ; i < num_list.size(); i++){
//
////            int[] a = {8,8,3,8,7,2,8,2,2,8};
//            num = num_list.get(i);
//
//            while(num.cnt > 1){
//
//                flag = true;
//                if(num.cnt * 2 <= a.length){
//
//                    for(int j = 0 ; j < a.length/2; j++ ){
//
//                        if(a[ 2*j ] == a[2*j + 1]){
//                            flag = false;
//                            break;
//                        }
//
//                    }
//                }
//
//                if(flag){
//                    break;
//                }else{
//                    num.cnt--;
//                }
//
//            }
//
//            if(flag && answer < num.cnt*2){
//                answer = num.cnt * 2;
//            }
//
//        }
//
//        return answer;
//    }
//
//}
//
//class Num implements Comparable<Num>{
//
//    public int num;
//    public int cnt;
//    public ArrayList<Integer> idx_list;
//
//    public Num(){}
//
//    public Num(int num, int cnt){
//        this.num = num;
//        this.cnt = cnt;
//
//        idx_list = new ArrayList<Integer>();
//    }
//
//    public int compareTo(Num n){
//
//        //플레이 횟수에 대해서는 오름차순
//        if(this.cnt < n.cnt){
//            return 1;
//        }else if(this.cnt == n.cnt){
//
//            //고유 번호에 대해서는 내림차순
//            if(this.num > n.num){
//                return 1;
//            }
//        }
//
//        return -1;
//    }
//}
//
//import java.util.*;
//
////class Solution {
////    public int solution(int[] a) {
////        int answer = -1;
////
////        if( a.length >= 2){
////
////            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
////            int cnt;
////
////            for(int i = 0 ; i < a.length; i++) {
////
////                if (hm.get(a[i]) != null) {
////                    cnt = hm.get(a[i]);
////                } else {
////                    cnt = 0;
////                }
////
////                hm.put(a[i], ++cnt);
////
////            }
////
////            Iterator<Integer> itr = hm.keySet().iterator();
////
////            while(itr.hasNext()){
////
////                cnt = itr.next();
////
////                if(hm.get(cnt) %2 == 0){
////
////                    if( (hm.get(cnt) * 2 <= a.length )&& (answer < hm.get(cnt) * 2)){
////                        answer = hm.get(cnt) * 2;
////                    }
////
////                }
////
////            }
////
////
////        }else{
////            answer = 0;
////        }
////        return answer;
////    }
////}
