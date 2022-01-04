package com.cc.research.base.sort;

import java.util.Arrays;

/**
 * @author 10082
 * @description: 给你一个长度为 n 的整数数组nums和 一个目标值target。请你从 nums 中选出三个整数，使它们的和与target最接近。
 * 返回这三个数的和。
 * 假定每组输入只存在恰好一个解。
 * <p>
 * 示例 1：
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 * <p>
 * 示例 2：
 * 输入：nums = [0,0,0], target = 1
 * 输出：0
 * <p>
 * 提示：
 * 3 <= nums.length <= 1000
 * -1000 <= nums[i] <= 1000
 * -104 <= target <= 104
 * @date 2021/12/8 9:37
 */
public class ThreeSumClosest_16 {
    public int threeSumClosest(int[] nums, int target) {
        int closeSum = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - closeSum)) {
                    closeSum = sum;
                }
                if (sum == target) {
                    return closeSum;
                } else if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                }
            }
        }
        return closeSum;
    }

    public static void main(String[] args) {
        int i = new ThreeSumClosest_16().threeSumClosest(new int[]{1, 1, 1, 0}, -100);
        System.out.println(i);
    }
}
