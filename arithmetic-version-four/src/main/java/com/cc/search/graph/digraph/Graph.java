package com.cc.search.graph.digraph;

import com.cc.search.basedatastrusts.Bag;

/**
 * @program: DataStructuresAndAlgorithms
 * @description:
 * @author: SunChao
 * @create: 2020-09-28 11:16
 **/
public class Graph {
    //顶点数目
    private final int V;

    //边的数目
    private int E;

    //邻接表
    private Bag<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        this.adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<>();
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        this.E++;
    }
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

}
