package space.leetcode;

import java.util.List;

public class AddTwoNumbersRE {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        ListNode ll1 = new ListNode(5);
        ListNode ll2 = new ListNode(6);
        ListNode ll3 = new ListNode(4);
        ll1.next = ll2;
        ll2.next = ll3;

        AddTwoNumbersRE addTwoNumbers = new AddTwoNumbersRE();
        ListNode result;
        result = addTwoNumbers.addTwoNumbersAnswer(l1, ll1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode addTwoNumbersAnswer(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode pointer = result;
        int sum = 0;
        while (l1 != null || l2 != null || sum > 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            pointer.next = new ListNode(sum % 10);
            sum /= 10;
            pointer = pointer.next;
        }
        return result.next;
    }
}