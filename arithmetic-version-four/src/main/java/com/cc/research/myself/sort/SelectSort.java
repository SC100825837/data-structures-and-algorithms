package com.cc.research.myself.sort;

/**
 * 选择排序
 */
public class SelectSort {

    public void sort(Comparable[] origin) {
        for (int i = 0; i < origin.length; i++) {
            int minEle = i;
            for (int j = i + 1; j < origin.length; j++) {
                if (compare(origin[j], origin[minEle])) {
                    minEle = j;
                }
            }
            exchange(origin, i, minEle);
        }
    }

    /**
     * 这种写法的缺点是，每次 遍历后面的元素找到比当前元素小的时候都会进行元素的交换，
     * 造成交换的次数 大于N
     * @param origin
     */
    /*public void sort(Comparable[] origin) {
        int N = origin.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (compare(origin[min], origin[j])) {
                    continue;
                }
                exchange(origin, min, j);
            }
        }
    }*/

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

    /**
     * 比较大小
     * @param a
     * @param b
     * @return
     */
    private boolean compare(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void main(String[] args) {
        String[] origins = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        SelectSort selectSort = new SelectSort();
        selectSort.sort(origins);
        for (String origin : origins) {
            System.out.print(origin);
        }
        System.out.println();
    }
}
