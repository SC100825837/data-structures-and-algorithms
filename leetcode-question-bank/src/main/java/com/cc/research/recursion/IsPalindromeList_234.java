package com.cc.research.recursion;

/**
 * @program: data-structures-and-algorithms
 * @description: 回文链表
 * 请判断一个链表是否为回文链表
 *
 * 输入: 1->2
 * 输出: false
 *
 * 输入: 1->2->2->1
 * 输出: true
 * @author: SunChao
 * @create: 2021-08-12 21:31
 **/
public class IsPalindromeList_234 {

    private ListNode frontNode = null;

    public boolean isPalindrome(ListNode head) {
        frontNode = head;
        return checkListNode(head);
    }

    private boolean checkListNode(ListNode current) {
        if (current != null) {
            if (checkListNode(current.next)) {
                if (current.val == frontNode.val) {
                    frontNode = frontNode.next;
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(3);
        ListNode listNode7 = new ListNode(1);
        ListNode listNode8 = new ListNode(2);
        ListNode listNode9 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;
        boolean palindrome = new IsPalindromeList_234().isPalindrome(listNode1);
        System.out.println(palindrome);
    }
}
