package com.cc.search.graph.MinimumSpanningTree;

import com.cc.search.basedatastrusts.Queue;
import com.cc.search.graph.MinimumSpanningTree.Edge;
import com.cc.search.graph.MinimumSpanningTree.EdgeWeightedGraph;
import com.cc.search.sort.MinPrecedenceQueue;

/**
 * @program: data-structures-and-algorithms
 * @description:
 * @author: SunChao
 * @create: 2021-02-04 11:21
 **/
public class LazyPrimMST {
    //最小生成树的顶点
    private boolean[] marked;
    //最小生成树的边
    private Queue<Edge> mst;
    //横切边，包括失效的边
    private MinPrecedenceQueue<Edge> pq;

    public LazyPrimMST(EdgeWeightedGraph graph) {
        pq = new MinPrecedenceQueue<>();
        marked = new boolean[graph.V()];
        mst = new Queue<>();
        visit(graph, 0);
        while (!pq.isEmpty()) {
            //从pq中得到权重最小的边
            Edge edge = pq.delMin();
            int v = edge.either();
            int w = edge.other(v);
            mst.enqueue(edge);
            if (!marked[v]) {
                visit(graph, v);
            }
            if (!marked[v]) {
                visit(graph, w);
            }
        }
    }

    private void visit(EdgeWeightedGraph graph, int v) {
        //标记顶点v并将所有连接v和未被标记顶点的边加入pq
        marked[v] = true;
        for (Edge edge : graph.adj(v)) {
            if (!marked[edge.other(v)]) {
                pq.insert(edge);
            }
        }
    }

    public Iterable<Edge> edges() {
        return mst;
    }

//    public double weight() {
//        return weight();
//    }
}
