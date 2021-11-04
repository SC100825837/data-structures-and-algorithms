package com.cc.search.graph.graph;

import com.cc.search.graph.digraph.Digraph;
import com.cc.search.graph.graph.BreadthFirstPaths;

/**
 * @program: data-structures-and-algorithms
 * @description: 广度优先搜索测试
 * @author: SunChao
 * @create: 2021-01-29 11:09
 **/
public class TestBFP {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 5);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 2);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 2);
        graph.addEdge(4, 3);
        graph.addEdge(5, 0);
        graph.addEdge(5, 3);

        BreadthFirstPaths breadthFirstPaths = new BreadthFirstPaths(graph, 0);

    }
}
