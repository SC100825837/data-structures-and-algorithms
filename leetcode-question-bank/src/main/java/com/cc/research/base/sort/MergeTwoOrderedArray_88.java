package com.cc.research.base.sort;

/**
 * @author 10082
 * @description: 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 * <p>
 * 示例1：
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 * @date 2021/12/1 15:52
 */
public class MergeTwoOrderedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] aux = new int[m + n];
        for (int i = 0; i < m; i++) {
            aux[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            aux[i + m] = nums2[i];
        }
        int left = 0, right = m;
        for (int i = 0; i < m + n; i++) {
            if (left >= m) {
                nums1[i] = aux[right++];
            } else if (right >= m + n) {
                nums1[i] = aux[left++];
            } else if (aux[left] <= aux[right]) {
                nums1[i] = aux[left++];
            } else {
                nums1[i] = aux[right++];
            }
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        new MergeTwoOrderedArray_88().merge(num1, 3, num2, 3);
        for (int i : num1) {
            System.out.println(i);
        }
    }
}
