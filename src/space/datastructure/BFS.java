package space.datastructure;

import java.util.ArrayList;

public class BFS {
    public static void main(String[] args) {

        boolean[] check = new boolean[8];
        ArrayList<Integer>[] map = new ArrayList[8];
        for (int i = 0; i < map.length; i++) {
            map[i] = new ArrayList<Integer>();
        }

        map[1].add(2);
        map[1].add(3);

        map[2].add(1);
        map[2].add(3);
        map[2].add(4);
        map[2].add(5);

        map[3].add(1);
        map[3].add(2);
        map[3].add(6);
        map[3].add(7);

        map[4].add(3);
        map[5].add(2);

        map[6].add(3);
        map[7].add(3);

        bfs(1, check, map);
    }

    static void bfs(int start, boolean[] check, ArrayList<Integer>[] map) {
        Queue<Integer> queue = new Queue<>();
        queue.add(start);
        check[start] = true;
        while (!queue.isEmpty()) {
            int x = queue.peek();
            queue.remove();
            System.out.println(x);
            for (int i = 0; i < map[x].size(); i++) {
                int y = map[x].get(i);
                if (!check[y]) {
                    queue.add(y);
                    check[y] = true;
                }
            }
        }
    }
}
