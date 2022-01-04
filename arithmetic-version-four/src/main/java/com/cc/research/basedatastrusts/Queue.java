package com.cc.research.basedatastrusts;

import java.util.Iterator;

/**
 * @program: DataStructuresAndAlgorithms
 * @description:
 * @author: SunChao
 * @create: 2020-09-28 17:07
 **/
public class Queue<Item> implements Iterable<Item> {

    //指向最早添加的节点的链接
    private Node first;

    //指向最近添加的节点的链接
    private Node last;

    //队列中元素数量
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null; //或者N == 0
    }

    public int size() {
        return this.N;
    }

    /**
     * 向表尾添加元素
     * @param item
     */
    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        N++;
    }


    /**
     * 从表头删除元素
     * @return
     */
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public void remove() {

        }
    }
}
