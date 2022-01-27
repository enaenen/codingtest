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

    public long nodeValueToString(ListNode node) {
        StringBuffer sb = new StringBuffer();
        while (node != null) {
            sb.append("" + node.val);
            node = node.next;
        }
        return Long.parseLong(sb.reverse().toString());
    }
    public int countDigit(long num){
        int count;
        count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        int l1Size = getListNodeSize(l1);
        int l2Size = getListNodeSize(l2);

        if (l1Size == 1 && l2Size == 1 && l1.val == 0 && l2.val == 0)
            result.val = 0;
        long firstNum = nodeValueToString(l1);
        long secondNum = nodeValueToString(l2);
        long sumOfTwo = firstNum + secondNum;
        int digitCount = countDigit(sumOfTwo);
        StringBuilder sb = new StringBuilder();
        while (0 <= --digitCount){
            sb.append(Long.toString(sumOfTwo).charAt(digitCount));
        }

        return result;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(9);


        ListNode ll1 = new ListNode(1);
        ListNode ll2 = new ListNode(9);
        ListNode ll3 = new ListNode(9);
        ListNode ll4 = new ListNode(9);
        ListNode ll5 = new ListNode(9);
        ListNode ll6 = new ListNode(9);
        ListNode ll7 = new ListNode(9);
        ListNode ll8 = new ListNode(9);
        ListNode ll9 = new ListNode(9);
        ListNode ll10 = new ListNode(9);
        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;
        ll4.next = ll5;
        ll5.next = ll6;
        ll6.next = ll7;
        ll7.next = ll8;
        ll8.next = ll9;
        ll9.next = ll10;

        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, ll1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
