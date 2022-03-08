package com.cc.research.graph.model;

/**
 * @program: data-structures-and-algorithms
 * @description:
 * @author: SunChao
 * @create: 2021-01-29 11:38
 **/
public class MultiplyModel implements Model {

    @Override
    public int act(int[] args) {
        int result = args[0];
        for (int i = 0; i < args.length - 1; i++) {
            result = result * args[i + 1];
        }
        return result;
    }
}
