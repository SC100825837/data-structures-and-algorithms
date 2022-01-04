package com.cc.research.base.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author 10082
 * @description: 合并区间，以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间
 * @date 2021/12/10 10:56
 */
public class MergeRange_56 {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < intervals.length;) {
            int t = intervals[i][1];
            int j = i + 1;
            while (j < intervals.length && intervals[j][0] <= t) {
                t = Math.max(t, intervals[j][1]);
                j++;
            }
            result.add(new int[]{intervals[i][0], t});
            i = j;
        }
        return result.toArray(new int[result.size()][]);
    }

    // 循环
    /*public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (result.get(result.size() - 1)[1] < start) {
                result.add(intervals[i]);
            } else {
                if (result.get(result.size() - 1)[1] < end) {
                    result.get(result.size() - 1)[1] = end;
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }*/

    public static void main(String[] args) {
        int[][] merge = new MergeRange_56().merge(new int[][]{{1, 4}, {0, 2}, {3, 5}});
        for (int[] row : merge) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
