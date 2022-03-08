package com.cc.research.graph.model;

/**
 * @program: data-structures-and-algorithms
 * @description: 模型工厂抽象类
 * @author: SunChao
 * @create: 2021-02-01 14:01
 **/
public abstract class AbstractModelFactory {
    public abstract  <T extends Model> T createModel(String modelName);
}
