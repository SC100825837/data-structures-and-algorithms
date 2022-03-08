package com.cc.research.graph.model;

import com.cc.research.basedatastrusts.Queue;

import java.util.Iterator;

/**
 * @program: data-structures-and-algorithms
 * @description: 处理模型图
 * @author: SunChao
 * @create: 2021-01-29 10:54
 **/
public class RunModelGraph {

    //到达该顶点的最短路径已知吗？
    private boolean[] marked;

    //起点
    private final int s;

    private Model[] models;

    //创建模型工厂
    private ModelFactory modelFactory = new ModelFactory();

    public RunModelGraph(DigraphModel digraphModel, int s) throws Exception {
        marked = new boolean[digraphModel.V()];
        this.s = s;

        int modelsNum = digraphModel.getModelNames().length;
        //存放模型的数组
        models = new Model[modelsNum];
        for (int i = 0; i < digraphModel.getModelNames().length; i++) {
            //工厂方法创建模型
            models[i] = modelFactory.createModel(digraphModel.getModelNames()[i]);
        }
    }

    public int[] calc(DigraphModel digraphModel, int s, int[] args) {
        return bfs(digraphModel, s, args);
    }

    private int[] bfs(DigraphModel digraphModel, int s, int[] args) {
        //放置模型的队列
        Queue<Integer> queue = new Queue<>();
        //放置模型对应结果
        Queue<Integer> resultQueue = new Queue<>();
        //标记起点
        marked[s] = true;
        //加入队列
        queue.enqueue(s);
        resultQueue.enqueue(models[s].act(args));

        int[] processArgs = {resultQueue.dequeue()};

        boolean calcFinishFlag = false;
        while (!queue.isEmpty()) {
            //从队列中删除下一顶点
            int v = queue.dequeue();

            for (Integer w : digraphModel.adj(v)) {
                //未被标记的相邻顶点
                if (!marked[w]) {
                    calcFinishFlag = true;
                    //标记
                    marked[w] = true;

                    //将它加入队列中
                    queue.enqueue(w);
                    //把过程结果放到队列
                    resultQueue.enqueue(models[w].act(processArgs));
                }
            }

            if (calcFinishFlag) {
                //统计当前节点指向下一级节点个数
                Iterator<Integer> iterator = digraphModel.adj(v).iterator();
                int currentNodeOutDegree = 0;
                while (iterator.hasNext()) {
                    Integer next = iterator.next();
                    if (next == null) break;
                    currentNodeOutDegree++;
                }
                //存放下级节点模型计算的结果
                processArgs = new int[currentNodeOutDegree];
                for (int i = 0; i < processArgs.length; i++) {
                    processArgs[i] = resultQueue.dequeue();
                }
                calcFinishFlag = false;
            }
        }
        return processArgs;
    }

}
