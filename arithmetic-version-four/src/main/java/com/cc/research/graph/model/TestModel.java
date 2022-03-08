package com.cc.research.graph.model;

/**
 * @program: data-structures-and-algorithms
 * @description:
 * @author: SunChao
 * @create: 2021-01-29 11:28
 **/
public class TestModel {
    public static void main(String[] args) throws Exception {
        DigraphModel digraphModel = new DigraphModel(8);
        digraphModel.addEdge(0, 1);
        digraphModel.addModel(0, "AddModel");

        digraphModel.addEdge(0, 2);
        digraphModel.addModel(1, "SubtractTenModel");

        digraphModel.addEdge(0, 3);
        digraphModel.addModel(2, "SubtractFiveModel");

        digraphModel.addEdge(1, 4);
        digraphModel.addModel(3, "SubtractFiveModel");

        digraphModel.addEdge(2, 4);

        digraphModel.addEdge(3, 4);
        digraphModel.addEdge(4, 5);
        digraphModel.addEdge(4, 6);
        digraphModel.addEdge(5, 7);
        digraphModel.addEdge(6, 7);
        digraphModel.addModel(4, "MultiplyModel");
        digraphModel.addModel(5, "SubtractTenModel");
        digraphModel.addModel(6, "SubtractTenModel");
        digraphModel.addModel(7, "AddModel");

        //创建"运行模型图"
        RunModelGraph runModelGraph = new RunModelGraph(digraphModel, 0);
        //调用模型图的计算方法
        int[] calcResult = runModelGraph.calc(digraphModel, 0, new int[]{10, 8});
        System.out.println(calcResult[0]);
    }
}
