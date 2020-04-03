package jooeun.baekjoon;

import javax.swing.text.html.HTMLDocument;
import java.io.*;
import java.util.*;

public class P_11650 {

    static HashMap<Integer, ArrayList<Integer>> xy;

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        xy = new HashMap<Integer, ArrayList<Integer>>();

        for(int i = 0 ; i < n ; i++ ){

            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            ArrayList<Integer> temp = xy.get(x);

            if(temp == null ){
                temp = new ArrayList<Integer>();
            }

            temp.add(y);
            xy.put(x,temp);

        }

        ArrayList<Integer> keyset = new ArrayList<Integer>(xy.keySet());

        Collections.sort(keyset);

        Iterator x_iterator = keyset.iterator();

        while(x_iterator.hasNext()){

            int x = (int)x_iterator.next();

            Collections.sort(xy.get(x));

            Iterator y_iterator = xy.get(x).iterator();

            while(y_iterator.hasNext()){
                System.out.println(x + " " + y_iterator.next());
            }

        }
    }
}
