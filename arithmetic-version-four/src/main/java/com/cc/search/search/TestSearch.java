package com.cc.search.search;

/**
 * @program: DataStructuresAndAlgorithms
 * @description:
 * @author: SunChao
 * @create: 2020-12-09 15:22
 **/
public class TestSearch {
    public static void main(String[] args) {
        BinarySearchTree<String, Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.put("S", 19);
        binarySearchTree.put("E", 5);
        binarySearchTree.put("R", 18);
        binarySearchTree.put("H", 8);
        binarySearchTree.put("C", 3);
        binarySearchTree.put("A", 1);
        binarySearchTree.put("M", 13);
        binarySearchTree.put("X", 24);
        binarySearchTree.printAll();
        System.out.println(binarySearchTree.size());
        System.out.println(binarySearchTree.get("A"));
        System.out.println(binarySearchTree.get("R"));
        System.out.println(binarySearchTree.get("X"));
    }
}
