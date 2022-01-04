package com.cc.research.search;

/**
 * @program: DataStructuresAndAlgorithms
 * @description:
 * @author: SunChao
 * @create: 2020-12-09 15:22
 **/
public class TestBinaryTree {
    public static void main(String[] args) {
        BinarySearchST<String, Integer> binarySearchST = new BinarySearchST<>();
        binarySearchST.put("S", 19);
        binarySearchST.put("E", 5);
        binarySearchST.put("R", 18);
        binarySearchST.put("H", 8);
        binarySearchST.put("C", 3);
        binarySearchST.put("A", 1);
        binarySearchST.put("M", 13);
        binarySearchST.put("X", 24);
        System.out.println("打印整棵树");
//        binarySearchST.printAll();
        System.out.println("打印树长度");
        System.out.println(binarySearchST.size());
        System.out.println("按键取值");
        System.out.println(binarySearchST.get("A"));
        System.out.println(binarySearchST.get("R"));
        System.out.println(binarySearchST.get("X"));

        //向下取整
        System.out.println("向下取整");
        System.out.println(binarySearchST.floor("G"));
        System.out.println(binarySearchST.floor("D"));
        System.out.println(binarySearchST.floor("N"));
        System.out.println(binarySearchST.floor("T"));
        System.out.println(binarySearchST.floor("Z"));

        System.out.println("取最小key");
        System.out.println(binarySearchST.min());

        System.out.println("按排名查找");
        System.out.println(binarySearchST.select(3));
        System.out.println(binarySearchST.select(8));

        System.out.println("删除最小");
//        System.out.println(binarySearchST.deleteMin());
//        System.out.println(binarySearchST.deleteMin());
//        System.out.println(binarySearchST.deleteMin());
//        System.out.println(binarySearchST.deleteMin());
//        System.out.println(binarySearchST.deleteMin());
//        System.out.println(binarySearchST.deleteMin());
//        System.out.println(binarySearchST.deleteMin());
//        System.out.println(binarySearchST.deleteMin());
//        System.out.println(binarySearchST.deleteMin());
    }
}
