package com.cc.research.search;

import java.util.HashMap;

/**
 * @program: data-structures-and-algorithms
 * @description:
 * @author: SunChao
 * @create: 2020-12-16 11:04
 **/
public class TestRedBlackTree {
    public static void main(String[] args) {
        RedBlackTree<String, Integer> redBlackTree = new RedBlackTree<>();
        redBlackTree.put("S", 19);
        redBlackTree.put("E", 5);
        redBlackTree.put("A", 1);
        redBlackTree.put("R", 18);
        redBlackTree.put("C", 3);
        redBlackTree.put("H", 8);
        redBlackTree.put("X", 24);
        redBlackTree.put("M", 13);
        redBlackTree.put("P", 16);
        redBlackTree.put("L", 12);
        redBlackTree.printAll();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        System.out.println();
    }
}
