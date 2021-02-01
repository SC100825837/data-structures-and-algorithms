package com.cc.search.graph.digraph;

/**
 * @program: data-structures-and-algorithms
 * @description: 广度优先搜索测试
 * @author: SunChao
 * @create: 2021-01-29 11:09
 **/
public class TestBFP {
    public static void main(String[] args) {
        Digraph digraph = new Digraph(4);
        digraph.addEdge(0, 1);
        digraph.addEdge(0, 2);
        digraph.addEdge(1, 3);
        digraph.addEdge(2, 3);

        BreadthFirstPaths breadthFirstPaths = new BreadthFirstPaths(digraph, 0);

    }
}
