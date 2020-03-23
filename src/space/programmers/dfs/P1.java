package space.programmers.dfs;

public class P1 {
    public static void main(String[] args) {
        int[] ary = {1, 1, 1, 1, 1};
        int t = 3;

        System.out.println(new P1().solution(ary, t));
    }

    public int solution(int[] numbers, int target) {
        return DFS(numbers, target, 0, 0);
    }

    public int DFS(int[] numbers, int target, int index, int sum) {
        //탈출조건
        //numbers 크기와 index가 같으면 탈출
        if (numbers.length == index) {
            //탈출할때 카운팅을 해야되는데, sum값이  target이랑 같으면 1 다르면 0 반환
            return sum == target ? 1 : 0;
        } else {
            return DFS(numbers, target, index + 1, sum + numbers[index])
                    + DFS(numbers, target, index + 1, sum - numbers[index]);
        }
        //루프문
    }

}