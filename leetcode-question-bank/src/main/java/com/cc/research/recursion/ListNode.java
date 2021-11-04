package com.cc.research.recursion;

/**
 * @program: data-structures-and-algorithms
 * @description:
 * @author: SunChao
 * @create: 2021-08-09 21:40
 **/
public class ListNode {
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
