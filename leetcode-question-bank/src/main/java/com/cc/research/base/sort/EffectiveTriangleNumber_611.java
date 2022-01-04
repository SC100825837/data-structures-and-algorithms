package com.cc.research.base.sort;

import java.util.Arrays;

/**
 * @author 10082
 * @description: 给定一个包含非负整数的数组，你的任务是统计其中可以组成三角形三条边的三元组个数
 * @date 2021/12/15 20:33
 */
public class EffectiveTriangleNumber_611 {
    public int triangleNumber(int[] nums) {
        int number = 0;
        Arrays.sort(nums);

        return number;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 4};
        int number = new EffectiveTriangleNumber_611().triangleNumber(nums);
        System.out.println(number);
    }
}
