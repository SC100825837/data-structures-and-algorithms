package com.cc.research.basedatastrusts;

/**
 * @program: data-structures-and-algorithms
 * @description: 求两个非负整数的最大公约数
 * @author: SunChao
 * @create: 2021-08-07 15:33
 **/
public class EuclideanAlgorithm {
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        int r = a % b;
        return gcd(b, r);
    }

    public static void main(String[] args) {
        int gcd = new EuclideanAlgorithm().gcd(10, 5);
        System.out.println(gcd);
    }
}
