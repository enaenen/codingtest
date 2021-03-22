package jooeun.codingtest.winterCoding_intern;

public class Solution1 {

    public static  void main(String[] args){

        int n = 7;
        int[][] delivery = {{5,6,0},{1,3,1},{1,5,0},{7,6,0},{3,7,1},{2,5,0}};

        String answer = solution(n,delivery);

        //answer = O?O?XXO
        //O?O?X?O
        System.out.println(answer);

    }

    public static String solution(int n, int[][] delivery) {

        StringBuffer answer = new StringBuffer("");
        int[] ary = new int[n];

        int n_1;
        int n_2;

        for(int i = 0 ; i < delivery.length; i++){

            n_1 = delivery[i][0] -1;
            n_2 = delivery[i][1] -1;

            if(delivery[i][2] == 1) {

                ary[n_1] = 1;
                ary[n_2] = 1;
            }

        }

        // {{5,6,0},{1,3,1},{1,5,0},{7,6,0},{3,7,1},{2,5,0}}
        for(int i = 0 ; i < delivery.length; i++){

            n_1 = delivery[i][0] -1;
            n_2 = delivery[i][1] -1;

            //배송 완료 : 재고가 있으면 1로 바꾸기
            if(delivery[i][2] == 0){

                //재고가 있는 경우
                if(ary[n_1] == 1){
                    //재고 없음
                    ary[n_2] = -1;
                }
                //재고가 없다면, 두번쨰 상품이 재고가 있는지 확실하지 않음. 따라서 0유지

                //재고가 없는 경우
                if(ary[n_2] == 1){
                    ary[n_1] = -1;
                }
                //재고가 없다면, 첫번째 상품이 재고가 있는지 확실하지 않음. 따라서 0유지

            }

        }

        for(int i : ary){
            if(i == 0){
                answer.append('?');
            }else if(i == 1){
                answer.append('O');
            }else if(i == -1){
                answer.append('X');
            }
        }


        return answer.toString();
    }

}
