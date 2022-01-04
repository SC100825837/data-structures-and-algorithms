package com.cc.research.basedatastrusts;

import java.util.Iterator;

/**
 * @program: DataStructuresAndAlgorithms
 * @description:
 * @author: SunChao
 * @create: 2020-09-28 17:07
 **/
public class Stack<Item> implements Iterable<Item> {

    //栈顶(最近添加的元素)
    private Node first;

    //元素数量
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
     * 向栈顶添加元素
     * @param item
     */
    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
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
