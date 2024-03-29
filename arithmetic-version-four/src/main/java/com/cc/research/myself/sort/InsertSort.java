package com.cc.research.myself.sort;

public class InsertSort {

    public void sort(Comparable[] origin) {
        for (int i = 1; i < origin.length; i++) {
            for (int j = i; j > 0; j--) {
                if (compare(origin[j], origin[j - 1])) {
                    exchange(origin, j, j - 1);
                }
            }
        }
    }

    /**
     * 比较大小 如果a 大于 b，那么返回true
     * @param a
     * @param b
     * @return
     */
    private boolean compare(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    /**
     * 交换数组中的两元素
     * @param origin
     * @param a
     * @param b
     */
    private void exchange(Comparable[] origin, int a, int b) {
        Comparable temp = origin[a];
        origin[a] = origin[b];
        origin[b] = temp;
    }


    public static void main(String[] args) {
        String[] origins = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        InsertSort insertSort = new InsertSort();
        insertSort.sort(origins);
        for (String origin : origins) {
            System.out.print(origin);
        }
        System.out.println();
    }
}
