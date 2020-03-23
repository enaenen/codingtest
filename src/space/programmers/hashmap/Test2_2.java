package programmers.hashmap;

/*
    작성자 : 채우주
    작성일자 : 2019-11-06
    Persudo

    hashmap<종류,횟수>

*/



/*

반복문
	clothes.length만큼
	if(맵에 옷의 종류가 이미 존재하면)
		맵에서 해당 종류의 횟수를 가져와서 +1
	아니면
		맵에서 해당 종류의 횟수를1로 설정

	밸류값들을 다 answer에 넣고
	answer를 -1 해서 리턴

 */
import java.util.HashMap;

public class Test2_2 {
    public static void main(String[] args)
    {
        String[][] clothes = {{"yellow_hat","headgear"},{"blue_sunglasses","eye_wear"},{"green_turban","headgear"}};

    }
    public int solution(String[][] clothes){
        HashMap<String, Integer> hm = new HashMap<String,Integer>();
        int count = clothes.length;

        for(int i=0;i<count;i++){
            String category = clothes[i][1];
            if(hm.containsKey(category)){
                hm.replace(category,hm.get(category)+1);
            }
            else{
                hm.put(category,1);
            }
        }
        int answer = 1;
        for(int values : hm.values()){
            answer *= values + 1;
        }
        return (answer-1);
    }
}
