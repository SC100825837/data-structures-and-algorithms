package com.cc.research.myself.sort;

/**
 * @author 10082
 * @description: 自己写的合并排序
 * @date 2021/12/2 14:44
 */
public class MyMerge {

    // 首先应该有个对外暴露的公共方法，可以传入数组
    public void sort(Comparable[] a) {
        if (a.length <= 1) {
            return;
        }
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

    private void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }

    private void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int left = lo, right = mid + 1;
        for (int i = lo; i <= hi; i++) {
            if (left > mid) {
                a[i] = aux[right++];
            } else if (right > hi) {
                a[i] = aux[left++];
            } else if (less(aux[left], aux[right])) {
                a[i] = aux[left++];
            } else {
                a[i] = aux[right++];
            }
        }
    }

    private boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void main(String[] args) {
        String[] strings = {"M", "E", "R", "G", "E", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        new MyMerge().sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
