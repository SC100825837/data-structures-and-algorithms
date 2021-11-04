package com.cc.research.recursion;

/**
 * @program: data-structures-and-algorithms
 * @description: 反转字符串
 *
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 * @author: SunChao
 * @create: 2021-08-12 21:05
 **/
public class ReverseString_344 {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
        while (low < high) {
            char str = s[low];
            s[low] = s[high];
            s[high] = str;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        new ReverseString_344().reverseString(chars);
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }
}