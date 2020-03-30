package jooeun.baekjoon;

public class P_2798 {

    static int n;
    static int m;
    static int[] numbers;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args){

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());

        //test case 1
//        n = 5;
//        m = 21;
//        numbers = new int[]{5, 6, 7, 8, 9};

        //test case 2
        n = 10;
        m = 500;
        numbers = new int[]{93, 181, 245, 214, 315, 36, 185, 138, 216, 295};

//        st = new StringTokenizer(br.readLine());
//        numbers = new int[n];
//        for(int i = 0 ; i< n ; i++) {
//            numbers[i] = Integer.parseInt(st.nextToken());
//        }

        dfs(0,0,0);

        System.out.println(answer);

    }

    private static void dfs(int index, int sum, int num){

        if(num == 3){
            if(sum <= m && sum >  answer){
                answer = sum;
            }
        }

        if(index == n){
            return ;
        }

        dfs(index+1,sum+numbers[index],num+1);

        dfs(index + 1, sum,num);

    }

}
