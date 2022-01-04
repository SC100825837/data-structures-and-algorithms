package com.cc.research.entity;

/**
 * @program: DataStructuresAndAlgorithms
 * @description:
 * @author: SunChao
 * @create: 2020-11-05 17:19
 **/
public class People {
    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
