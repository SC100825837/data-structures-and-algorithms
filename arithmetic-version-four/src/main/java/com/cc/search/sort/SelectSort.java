package com.cc.search.sort;

import java.util.List;

/**
 * @program: DataStructuresAndAlgorithms
 * @description: 选择排序
 * @author: SunChao
 * @create: 2020-10-19 20:02
 **/
public class SelectSort {
    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (less(arr[i], arr[j])) {
                    exch(arr, i, j);
                }
            }
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
