package com.cc.research.graph.model;

/**
 * @program: data-structures-and-algorithms
 * @description: 模型工厂
 * @author: SunChao
 * @create: 2021-02-01 14:03
 **/
public class ModelFactory extends AbstractModelFactory {

    private String MODEL_PACKAGE_NAME = "com.cc.search.graph.digraph.model.";
    @Override
    public <T extends Model> T createModel(String modelName) {
        Model model = null;
        try {
            model = (Model) Class.forName(MODEL_PACKAGE_NAME + modelName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) model;
    }
}
