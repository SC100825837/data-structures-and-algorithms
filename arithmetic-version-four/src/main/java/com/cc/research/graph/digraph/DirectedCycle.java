package com.cc.research.graph.digraph;

import com.cc.research.basedatastrusts.Stack;

/**
 * @program: DataStructuresAndAlgorithms
 * @description: 判断是否有环
 * @author: SunChao
 * @create: 2020-09-28 19:52
 **/
public class DirectedCycle {
    private boolean[] marked;
    private int[] edgeTo;

    //有向环中的所有顶点（如果存在)
    private Stack<Integer> cycle;

    //递归调用的栈上的所有顶点
    private boolean[] onStack;

    public DirectedCycle(Digraph G) {
        onStack = new boolean[G.V()];
        edgeTo = new int[G.V()];
        marked = new boolean[G.V()];
        for (int v = 0; v < G.V(); v++) {
            if (!marked[v]) {

            }
        }
    }

    private void dfs(Digraph G, int v) {
        onStack[v] = true;
        marked[v] = true;
        for (Integer w : G.adj(v)) {
            if (this.hasCycle()) {
                return;
            } else if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            } else if (onStack[w]) {
                cycle = new Stack<>();
                for (int x = v; x != w; x = edgeTo[x]) {
                    cycle.push(x);
                }
                cycle.push(w);
                cycle.push(v);
            }
        }
        onStack[v] = false;
    }

    public boolean hasCycle() {
        return cycle != null;
    }

    public Iterable<Integer> cycle() {
        return cycle;
    }
}
