package com.kapcb.ccc.algorithm.leetcode;


/**
 * <a>Title: TwoLinkNumSum </a>
 * <a>Author: Mike Chen <a>
 * <a>Description: TwoLinkNumSum <a>
 *
 * @author Mike Chen
 * @date 2022/2/21 10:47
 */
public class TwoLinkNumSum {

    private TwoLinkNumSum() {
    }

    private static ListNode doTwoLinkNumSum(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return new ListNode();
        }
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            cur = new ListNode(sum);

            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

    private static class ListNode {
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

    public static void main(String[] args) {
        int a = 5, b = 7;
        int i = a + b;
        int i1 = i / 10;
        int i2 = i % 10;
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
    }

}
