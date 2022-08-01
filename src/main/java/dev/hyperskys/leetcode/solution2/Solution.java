package dev.hyperskys.leetcode.solution2;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;

        ListNode resNode = new ListNode();
        ListNode copyNode = resNode;

        while(l1 != null || l2 != null || sum != 0) {
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode newNode = new ListNode();
            newNode.val = sum % 10;
            copyNode.next = newNode;
            copyNode = newNode;

            sum /= 10;
        }

        return resNode.next;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(); l1.val = 1;
        ListNode l2 = new ListNode(); l2.val = 2;
        ListNode listNode = solution.addTwoNumbers(l1, l2);
        System.out.println(listNode.val);
    }
}
