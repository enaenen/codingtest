package space.leetcode.leetcode75.easy;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        System.out.println("true == " + canPlaceFlowers(new int[] {1,0,0,0,1}, 1));
        System.out.println("false == " + canPlaceFlowers(new int[] {1,0,0,0,1}, 2));
        System.out.println("true == " + canPlaceFlowers(new int[] {0,0,0,0,1}, 2));
        System.out.println("true == " + canPlaceFlowers(new int[] {0,0,0,0,0}, 2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // 현재 index -1, +1 이 모두 0 이 가능
        if ( n == 0 )
            return true;
        for (int i = 0; i < flowerbed.length; ++i){
            if (flowerbed[i]==0){
                if ((i == 0 || flowerbed[i - 1] == 0)  //  첫번째 || 앞에가 0 그리고,
                        && (i == flowerbed.length -1 || flowerbed[i + 1] == 0))// 마지막 || 뒤에가 0
                {
                    flowerbed[i] = 1;
                    if (--n == 0)
                        return true;
                }
            }
        }
        return false;
    }

}
