package com.cc.research.graph.MinimumSpanningTree;

import com.cc.research.basedatastrusts.Bag;

/**
 * @program: data-structures-and-algorithms
 * @description:
 * @author: SunChao
 * @create: 2021-02-04 10:22
 **/
public class EdgeWeightedGraph {
    private final int V;
    private int E;
    private Bag<Edge>[] adj;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
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

    public void addEdge(Edge edge) {
        int v = edge.either();
        int w = edge.other(v);
        adj[v].add(edge);
        adj[w].add(edge);
        E++;
    }
    public Iterable<Edge> adj(int v) {
        return adj[v];
    }

    /**
     * 返回加权图中的所有边
     * @return
     */
    public Iterable<Edge> edges() {
        Bag<Edge> edges = new Bag<>();
        for (int v = 0; v < V; v++) {
            for (Edge edge : adj[v]) {
                if (edge.other(v) > v) {
                    edges.add(edge);
                }
            }
        }
        return edges;
    }
}
