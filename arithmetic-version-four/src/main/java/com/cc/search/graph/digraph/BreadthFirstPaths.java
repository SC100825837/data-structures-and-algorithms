package com.cc.search.graph.digraph;

import com.cc.search.basedatastrusts.Queue;
import com.cc.search.basedatastrusts.Stack;

/**
 * @program: data-structures-and-algorithms
 * @description: 广度优先搜索
 * @author: SunChao
 * @create: 2021-01-29 10:54
 **/
public class BreadthFirstPaths {

    //到达该顶点的最短路径已知吗？
    private boolean[] marked;

    //到达该顶点的已知路径上的最后一个顶点
    private int[] edgeTo;

    //起点
    private final int s;

    public BreadthFirstPaths(Digraph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        bfs(G, s);
    }

    private void bfs(Digraph G, int s) {
        Queue<Integer> queue = new Queue<>();
        //标记起点
        marked[s] = true;
        //加入队列
        queue.enqueue(s);
        while (!queue.isEmpty()) {
            //从队列中删除下一顶点
            int v = queue.dequeue();
            for (Integer w : G.adj(v)) {
                //未被标记的相邻顶点
                if (!marked[w]) {
                    //保存最短路径的最后一条边
                    edgeTo[w] = v;
                    //标记，因为最短路径已知
                    marked[w] = true;
                    //将它加入队列中
                    queue.enqueue(w);
                }
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<>();
        for (int x = v; x != s; x = edgeTo[x])
            path.push(x);
        path.push(s);
        return path;
    }
}
