package space.inflearn.java.lookback;

public class FlippingSpecialChar2 {
    public static void main(String[] args) {
        System.out.println(solution("a#b!GE*T@S"));
    }

    public static String solution(String args) {
      char[] arr = args.toCharArray();
      int start = 0;
      int end = arr.length-1;
      while (start < end){
          if (Character.isAlphabetic(arr[start]) && Character.isAlphabetic(arr[end])){
              char tmp = arr[start];
              arr[start++] = arr[end];
              arr[end--] = tmp;
          }
          else if (Character.isAlphabetic(arr[start])){
              --end;
          }
          else if (Character.isAlphabetic(arr[end])){
              ++start;
          }
          else{
              --end;
              ++start;
          }
      }
        for (char c : arr) {
            System.out.print(c);
        }
      return arr.toString();
    };
}
