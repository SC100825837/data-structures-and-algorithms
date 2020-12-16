package com.cc.search.search;

/**
 * @program: DataStructuresAndAlgorithms
 * @description: 二叉查找树
 * @author: SunChao
 * @create: 2020-12-09 15:00
 **/
public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private Node root;

    private class Node {
        private Key key;
        private Value value;
        private int N;
        private Node left, right;

        public Node(Key key, Value value, int n) {
            this.key = key;
            this.value = value;
            this.N = n;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) return 0;
        else return node.N;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null) return new Node(key, value, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            x.right = put(x.right, key, value);
        } else {
            x.value = value;
        }
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        } else {
            return x.value;
        }

    }

    public Key min() {
        if (root == null) return null;
        return min(root).key;
    }

    private Node min(Node x) {
        if (x.left == null) return x;
        return min(x.left);
    }


    public Key floor(Key key) {
        if (key == null) return null;
        return floor(root, key).key;
    }

    private Node floor(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return floor(x.left, key);
        } else if (cmp > 0) {
            Node t = floor(x.right, key);
            if (t == null) {
                return x;
            } else {
                return t;
            }
        } else {
            return x;
        }
    }

    public Key select(int k) {
        if (k > size(root) - 1) return null;
        return select(root, k).key;
    }

    private Node select(Node x, int k) {
        if (x == null) {
            return null;
        }
        int t = size(x.left);
        if (t > k) {
            return select(x.left, k);
        } else if (t < k) {
            return select(x.right, k - t - 1);
        } else {
            return x;
        }
    }

    public Key deleteMin() {
        if (size(root) == 1) {
            Node t = root;
            root = null;
            return t.key;
        }
        return deleteMin(root).key;
    }

    private Node deleteMin(Node x) {
        if (x.left == null) {
            return x.right;
        }
        x.left = deleteMin(x.left);
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public void printAll() {
        print(root);
        System.out.println();
    }

    private void print(Node node) {
        if (node == null) {
            return;
        }
        print(node.left);
        System.out.print(node.key + "\t");
        print(node.right);
    }
}
