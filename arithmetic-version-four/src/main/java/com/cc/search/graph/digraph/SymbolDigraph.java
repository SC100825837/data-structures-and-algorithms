package com.cc.search.graph.digraph;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: DataStructuresAndAlgorithms
 * @description: 符号图
 * @author: SunChao
 * @create: 2020-09-28 10:50
 **/
public class SymbolDigraph {
    //符号名 → 索引
    private Map<String, Integer> map;

    //索引 → 符号名
    private String[] keys;

    //图
    private Digraph G;

    public SymbolDigraph(String stream, String sp) throws IOException {
        map = new HashMap<>();
        //第一遍
        BufferedReader reader = new BufferedReader(new FileReader(stream));
        String tempString = null;
        int line = 0;
        //构造索引 读取字符串
        while ((tempString = reader.readLine()) != null) {
            System.out.println("line: " + line++ + ":\t" + tempString);
            String[] strings = tempString.split(sp);
            //为每个不同的字符串关联一个索引
            for (String string : strings) {
                if (!map.containsKey(string)) {
                    map.put(string, map.size());
                }
            }
        }
        //用来获得顶点名的反向索引是一个数组
        keys = new String[map.size()];
        for (String name : map.keySet()) {
            keys[map.get(name)] = name;
        }
        G = new Digraph(map.size());
        //第二遍
        reader = new BufferedReader(new FileReader(stream));
        String tempString2 = null;
        //构造图 将每一行的顶点和该行的其他顶点相连
        while ((tempString2 = reader.readLine()) != null) {
            String[] strings = tempString2.split(sp);
            int v = map.get(strings[0]);
            for (int i = 0; i < strings.length; i++) {
                G.addEdge(v, map.get(strings[i]));
            }
        }
    }

    public boolean contains(String s) {
        return map.containsKey(s);
    }

    public int index(String s) {
        return map.get(s);
    }

    public String name(int v) {
        return keys[v];
    }

    public Digraph getG() {
        return G;
    }

}
