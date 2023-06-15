package space.inflearn.java.lookback;

public class DuplicatedCharDelete {
    public static void main(String[] args) {
        String input = "ksekkset";
        StringBuilder answer = new StringBuilder();
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; ++i){
            if (i != input.indexOf(arr[i]))
                continue;
            answer.append(arr[i]);
        }
        System.out.println(answer);
    }
}
