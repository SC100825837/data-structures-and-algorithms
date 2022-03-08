package com.cc.research.sword;

/**
 * @author 10082
 * @description: 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 * 示例 1：
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 *
 * 示例 2：
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *
 * @date 2022/1/6 16:51
 */
public class LeastNumbers_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }
        Integer[] heap = new Integer[k + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < heap.length && heap[i + 1] == null) {
                heap[i + 1] = arr[i];
                swim(heap, i + 1);
            } else if (heap[1] > arr[i]) {
                heap[1] = arr[i];
                sink(heap, 1);
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = heap[i + 1];
        }
        return result;
    }

    private void swim(Integer[] heap, int k) {
        while (k / 2 >= 1 && heap[k / 2] < heap[k]) {
            int parent = k / 2;
            exch(heap, parent, k);
            k = parent;
        }
    }

    private void sink(Integer[] heap, int k) {
        while (k * 2 < heap.length) {
            int child = k * 2;
            if (child + 1 < heap.length && heap[child] < heap[child + 1]) {
                child++;
            }
            if (heap[k] >= heap[child]) {
                break;
            }
            exch(heap, k, child);
            k = child;
        }
    }

    private void exch(Integer[] heap, int a, int b) {
        Integer temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {0, 0, 0, 2, 0, 5};
        int[] leastNumbers = new LeastNumbers_40().getLeastNumbers(arr, 0);
        for (int leastNumber : leastNumbers) {
            System.out.print(leastNumber);
            System.out.print(" ");
        }
    }
}
