package com.cc.research.base.sort;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 10082
 * @description: 多数元素
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于[n/2]元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * 示例 1：
 * 输入：[3,2,3]
 * 输出：3
 * <p>
 * 示例 2：
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 * @date 2021/12/6 10:27
 */
public class MajorityElement_169 {
    /**
     * 解法1：哈希表
     * @Param: nums
     * @return: int
     * @author: Sun
     * @date: 2021/12/6 11:01
     */
    /*public int majorityElement(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            if (counter.containsKey(num)) {
                counter.put(num, counter.get(num) + 1);
            } else {
                counter.put(num, 1);
            }
        }
        Integer maxCount = 0;
        Integer num = 0;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                num = entry.getKey();
            }
        }
        return num;
    }*/

    /**
     * 解法1：投票
     *
     * @Param: nums
     * @return: int
     * @author: Sun
     * @date: 2021/12/6 11:01
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int i = new MajorityElement_169().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        System.out.println(i);
    }
}
