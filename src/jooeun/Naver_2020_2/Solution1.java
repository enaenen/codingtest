package jooeun.Naver_2020_2;

public class Solution1 {

    public static void main(String[] args){

        int n = 7;
        int[] p = {6,2,1,0,2,4,3};
        int[] c = {3,6,6,2,3,7,6};

        //100
        String result = solution(n,p,c);
        System.out.println(result);

    }

    public static String solution(int n, int[] p, int[] c){

        //재고
        int truck = 0;
        //판매금액
        int[] money = {100,50,25,0};
        int money_idx_now = 0;
        int money_idx_before = 0;

        //총 금액
        double m_sum = 0;

        for(int i = 0 ; i < n ; i++){

            truck +=p[i];

            //판매가 가능할 경우
            if(truck >= c[i]){

                //어제는 납품을 제대로 햇는가? -> 전날
                if(money_idx_before == money_idx_now){
                    money_idx_now = 0;
                }

                truck -= c[i];
                m_sum += c[i]*money[money_idx_now];

                money_idx_before = money_idx_now;

            }else{
                //거래 종료
                if(money_idx_now == (money.length -1) ){
                    break;
                }else{
                    money_idx_before = money_idx_now;
                    money_idx_now++;
                }
            }
        }

        //소수점 세번쨰 자리에서 반올림
        double avg = (m_sum/6)*1000.0;
        avg = Math.round(avg)/1000.0;

        if((avg-(int)avg)*10%10 == 0){
            return avg+"0";
        }else{
            return avg+"";
        }

    }
}
