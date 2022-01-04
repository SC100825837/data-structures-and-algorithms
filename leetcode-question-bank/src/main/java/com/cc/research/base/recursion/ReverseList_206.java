package com.cc.research.base.recursion;

/**
 * @program: data-structures-and-algorithms
 * @description: 反转链表
 * 这个就是常规操作了，使用一个变量记录前驱 pre，一个变量记录后继 next，不断更新current.next = pre 就好了。
 *
 * 链表的题目 90% 的 bug 都出现在：
 * 1.头尾节点的处理
 * 2.指针循环引用导致死循环
 * 因此对这两个问题要保持 100% 的警惕。
 *
 * @author: SunChao
 * @create: 2021-08-11 19:19
 **/
public class ReverseList_206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        new ReverseList_206().reverseList(listNode1);
    }
}
