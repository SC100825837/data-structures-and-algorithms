package com.cc.research.base.sort;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 10082
 * @description: 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false.
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: [1,2,3,4]
 * 输出: false
 * <p>
 * 示例3:
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 * @date 2021/12/6 11:06
 */
public class ContainsDuplicateElement_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> check = new HashSet<>();
        for (int num : nums) {
            if (!check.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = new ContainsDuplicateElement_217().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        System.out.println(b);
    }
}
