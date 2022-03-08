package com.cc.research.graph.model;

/**
 * @program: data-structures-and-algorithms
 * @description: 减法
 * @author: SunChao
 * @create: 2021-01-29 11:35
 **/
public class SubtractTenModel implements Model {
    @Override
    public int act(int[] args) {
        return args[0] - 10;
    }
}
