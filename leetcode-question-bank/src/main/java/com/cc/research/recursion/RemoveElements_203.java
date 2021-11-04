package com.cc.research.recursion;

/**
 * @program: data-structures-and-algorithms
 * @description: 移除链表元素
 *
 *
 * @author: SunChao
 * @create: 2021-08-11 19:54
 **/
public class RemoveElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode current = dummy;

        while (current != null && current.next != null) {
            ListNode next = current.next;
            if (next.val == val) {
                current.next = next.next;
                next = next.next;
            }

            if (next != null) {
                current = next;
            }
        }

        return dummy.next;
    }
    /**
     * 第一次尝试，找到了链表中的第一个目标值就返回
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements1(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        head.next = removeElements1(head.next, val);
        return head;
    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(6);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);
        ListNode listNode7 = new ListNode(6);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        ListNode listNode = new RemoveElements_203().removeElements(listNode1, 6);
        System.out.println(listNode);
    }
}
