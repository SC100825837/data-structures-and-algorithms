package com.cc.search.search;

/**
 * @program: DataStructuresAndAlgorithms
 * @description:
 * @author: SunChao
 * @create: 2020-12-09 15:22
 **/
public class TestBinaryTree {
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
        System.out.println("打印整棵树");
        binarySearchTree.printAll();
        System.out.println("打印树长度");
        System.out.println(binarySearchTree.size());
        System.out.println("按键取值");
        System.out.println(binarySearchTree.get("A"));
        System.out.println(binarySearchTree.get("R"));
        System.out.println(binarySearchTree.get("X"));

        //向下取整
        System.out.println("向下取整");
        System.out.println(binarySearchTree.floor("G"));
        System.out.println(binarySearchTree.floor("D"));
        System.out.println(binarySearchTree.floor("N"));
        System.out.println(binarySearchTree.floor("T"));
        System.out.println(binarySearchTree.floor("Z"));

        System.out.println("取最小key");
        System.out.println(binarySearchTree.min());

        System.out.println("按排名查找");
        System.out.println(binarySearchTree.select(3));
        System.out.println(binarySearchTree.select(8));

        System.out.println("删除最小");
        System.out.println(binarySearchTree.deleteMin());
        System.out.println(binarySearchTree.deleteMin());
        System.out.println(binarySearchTree.deleteMin());
        System.out.println(binarySearchTree.deleteMin());
        System.out.println(binarySearchTree.deleteMin());
        System.out.println(binarySearchTree.deleteMin());
        System.out.println(binarySearchTree.deleteMin());
        System.out.println(binarySearchTree.deleteMin());
        System.out.println(binarySearchTree.deleteMin());
    }
}
