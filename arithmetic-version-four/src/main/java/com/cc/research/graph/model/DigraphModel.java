package com.cc.research.graph.model;


import java.util.LinkedList;

/**
 * @program: DataStructuresAndAlgorithms
 * @description:
 * @author: SunChao
 * @create: 2020-09-28 19:56
 **/
public class DigraphModel {

    //节点个数
    private final int V;

    //边个数
    private int E;

    //邻接表存放模型节点
    private LinkedList<Integer>[] adj;

    //存放模型名称
    private String[] modelNames;

    public DigraphModel(int V) {
        this.V = V;
        this.E = 0;
        //创建邻接表
        adj = (LinkedList<Integer>[]) new LinkedList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
        modelNames = new String[V];
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].addFirst(w);
        E++;
    }

    public void addModel(int v, String model) {
        modelNames[v] = model;
    }

    public String[] getModelNames() {
        return modelNames;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

}
