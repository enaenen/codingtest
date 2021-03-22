package jooeun.LeetCode;

import java.math.BigInteger;

public class AddTwoNumbers {

    public static void main(String[] args){

//        //2, 4, 3
//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//        //5, 6, 4
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

//        // 9
//        ListNode l1 = new ListNode(9);
//        // 1, 9,9,9,9,9,9,9,9,9
//        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));

        // 1,1, 1,1, 1,1, 1,1, 1,1, 1
        ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1)))))))))));
        // 1,1, 1,1, 1,1, 1,1, 1,1, 1
        ListNode l2 = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1)))))))))));

        ListNode answer = solution(l1, l2);

        ListNode temp = answer;
        while(true){

            System.out.print(temp.val + "   ");

            if(temp.next == null)
                break;
            else
                temp = temp.next;
        }
        System.out.println();

    }

    public static ListNode solution(ListNode l1, ListNode l2){

        return convertToListNode(convertToInteger(l1).add(convertToInteger(l2)));
    }

    private static ListNode convertToListNode(BigInteger n){

        BigInteger num = n; // 807
        BigInteger square_of_10 = new BigInteger("10");
        BigInteger zero = new BigInteger("0");

        ListNode result = new ListNode((num.remainder(square_of_10)).intValue()); //7
        ListNode front_ls = result;
        ListNode next_ls;

        while(true){

            num = num.divide(square_of_10); //80 // 8
//            System.out.println(num);
            if(num.compareTo(zero) == 1){
                next_ls = new ListNode((num.remainder(square_of_10)).intValue()); // 0 // 8
                front_ls.next = next_ls;

                front_ls = next_ls;
            }else
                break;

        }

        return result;
    }

    private static BigInteger convertToInteger(ListNode listNode){
        ListNode temp_ls = listNode;
        StringBuilder sb = new StringBuilder();

        while(true){
            sb.insert(0, temp_ls.val);

            if(temp_ls.next == null)
                break;
            else
                temp_ls = temp_ls.next;
        }

        return new BigInteger(sb.toString());
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
