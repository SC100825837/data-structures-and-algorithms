package com.cc.search.graph.digraph;

import java.io.IOException;

/**
 * @program: DataStructuresAndAlgorithms
 * @description: 测试拓扑排序
 * @author: SunChao
 * @create: 2020-09-28 20:22
 **/
public class TestTopological {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Java\\workSpace\\DataStructuresAndAlgorithms\\ArithmeticVersionFour\\src\\main\\resources\\graph.txt";
        SymbolDigraph sg = new SymbolDigraph(filePath, "/");
        Topological top = new Topological(sg.getG());
        for (Integer v : top.order()) {
            System.out.println(sg.name(v));
        }
    }
}
