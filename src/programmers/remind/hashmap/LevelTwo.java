package programmers.remind.hashmap;

public class LevelTwo {
    public static void main(String[] args){
        String[] tc1 = {"119","97674223","1195524421"};
        String[] tc2 = {"123","456","789"};
        String[] tc3 = {"23","456","4568","1","1010"};

        System.out.println(solution(tc1));
        System.out.println(solution(tc2));
        System.out.println(solution(tc3));
    }
    public static boolean solution(String[] phone_book){
        for(int i=0;i<phone_book.length;i++){
            for(int j=i+1;j<phone_book.length;j++){
                if(phone_book[j].startsWith(phone_book[i]))
                    return false;
                if(phone_book[i].startsWith(phone_book[j]))
                    return false;
            }
        }
        return true;
    }
}
