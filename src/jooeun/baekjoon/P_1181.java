package jooeun.baekjoon;

import java.io.*;
import java.util.*;

public class P_1181 {

    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        HashMap<Integer, HashSet<String>> words = new HashMap<Integer, HashSet<String>>();

        for(int i = 0 ; i < n ; i++){

            st =  new StringTokenizer(br.readLine());
            String word = st.nextToken();

            int len = word.length();
            HashSet<String> temp = words.get(len);

            if(temp == null){
                temp = new HashSet<String>();
            }
            temp.add(word);
            words.put(len, temp);
        }

        List<Integer> key_set = new ArrayList<Integer>(words.keySet());
        Collections.sort(key_set);
        Iterator len_iterator = key_set.iterator();

        Iterator word_iterator;
        HashSet<String> word_set;
        List<String> word_list;

        while(len_iterator.hasNext()){

            word_set = words.get(len_iterator.next());

            word_list = new ArrayList<String>(word_set);
            Collections.sort(word_list);
            word_iterator = word_list.iterator();

            while(word_iterator.hasNext()){
                System.out.println(word_iterator.next());
            }

        }
    }
}
