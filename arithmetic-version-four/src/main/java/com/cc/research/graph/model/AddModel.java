package com.cc.research.graph.model;

/**
 * @program: data-structures-and-algorithms
 * @description:
 * @author: SunChao
 * @create: 2021-01-29 11:30
 **/
public class AddModel implements Model {
    @Override
    public int act(int[] args) {
        int result = 0;
        for (int i = 0; i < args.length - 1; i++) {
            result = args[i] + args[i + 1];
        }
        return result;
    }
}
