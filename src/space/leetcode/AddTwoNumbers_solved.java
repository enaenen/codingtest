package space.leetcode;

/**
 * 2022-01-26
 * https://leetcode.com/problems/add-two-numbers/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers_solved {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode dummy = head;
        int sum = 0;
        while (l1 != null || l2 != null || sum > 0)
        {
            if (l1 != null)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null)
            {
                sum+= l2.val;
                l2 = l2.next;
            }
            System.out.println(sum);
            dummy.next = new ListNode(sum%10);
            sum /= 10;
            dummy = dummy.next;
        }
        return head.next;
    }
}