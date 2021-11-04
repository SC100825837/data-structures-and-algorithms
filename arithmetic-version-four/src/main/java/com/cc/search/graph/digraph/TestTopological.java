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
        /*String filePath = "E:\\Java\\workSpace\\DataStructuresAndAlgorithms\\ArithmeticVersionFour\\src\\main\\resources\\graph.txt";
        SymbolDigraph sg = new SymbolDigraph(filePath, "/");
        Topological top = new Topological(sg.getG());
        for (Integer v : top.order()) {
            System.out.println(sg.name(v));
        }*/
        Digraph digraph = new Digraph(13);
        digraph.addEdge(0, 6);
        digraph.addEdge(0, 1);
        digraph.addEdge(0, 5);
        digraph.addEdge(2, 0);
        digraph.addEdge(2, 3);
        digraph.addEdge(3, 5);
        digraph.addEdge(5, 4);
        digraph.addEdge(6, 4);
        digraph.addEdge(6, 9);
        digraph.addEdge(7, 6);
        digraph.addEdge(8, 7);
        digraph.addEdge(9, 10);
        digraph.addEdge(9, 12);
        digraph.addEdge(9, 11);
        digraph.addEdge(11, 12);
//        System.out.println(digraph.toString());
        Topological topological = new Topological(digraph);
        for (Integer integer : topological.order()) {
            System.out.println(integer);
        }
    }
}
