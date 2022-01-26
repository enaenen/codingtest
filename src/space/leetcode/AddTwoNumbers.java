package space.leetcode;

/**
 * 2022-01-26
 * https://leetcode.com/problems/add-two-numbers/
 */

import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

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
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {

    public int getListNodeSize(ListNode node) {
        int size = 0;
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

    public int nodeValueToString(ListNode node) {
        StringBuffer sb = new StringBuffer();
        while (node != null) {
            sb.append("" + node.val);
            node = node.next;
        }
        return Integer.parseInt(sb.reverse().toString());
    }

    //    public int flipNumber(int num){
//        int result = 0;
//        while (num != 0) {
//            result = result * 10 + num % 10;
//            num /= 10;
//        }
//        return num;
//    }
    public ListNode resultOfSum(int num) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while (num != 0) {
            temp.next = new ListNode(num % 10);
            num /= 10;
            temp = temp.next;
        }
        return head.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        int l1Size = getListNodeSize(l1);
        int l2Size = getListNodeSize(l2);

        if (l1Size == 1 && l2Size == 1 && l1.val == 0 && l2.val == 0)
            result.val = 0;
        int firstNum = nodeValueToString(l1);
        int secondNum = nodeValueToString(l2);
        int sumOfTwo = firstNum + secondNum;

        result = resultOfSum(sumOfTwo);
        return result;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
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

        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, ll1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
