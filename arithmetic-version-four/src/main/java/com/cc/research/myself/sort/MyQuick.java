package com.cc.research.myself.sort;

/**
 * @author 10082
 * @description: 自己写的快速排序
 * @date 2021/12/2 17:03
 */
public class MyQuick {

    public void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    private void sort(Comparable[] a, int lo, int hi) {
        Comparable v = a[lo];
        int index = partition(a, lo, hi);
        sort(a, lo, index - 1);
        sort(a, index + 1, hi);
    }

    private int partition(Comparable[] a, int lo, int hi) {
        int left = lo, right = hi + 1;
        while ()
    }

    private boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        String[] strings = {"K", "R", "A", "T", "E", "L", "E", "P", "U", "I", "M", "Q", "C", "X", "O", "S"};
        new MyQuick().sort(strings);
        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
