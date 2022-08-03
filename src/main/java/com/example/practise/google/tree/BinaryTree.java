package com.example.practise.google.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTree {

    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    void insert(Node node, int data) {
        if (data < node.data) {
            if (node.left == null) {
                node.left = new Node(data);
            } else {
                insert(node.left, data);
            }
        } else if (data > node.data) {
            if (node.right == null) {
                node.right = new Node(data);
            } else {
                insert(node.right, data);
            }
        }
    }


    boolean isSame(Node t1, Node t2) {
        List<Integer> data1 = new ArrayList<>();
        traverseAndStore(t1, data1);
        List<Integer> data2 = new ArrayList<>();
        traverseAndStore(t2, data2);
        return data1.equals(data2);
    }


    public void traverseAndStore(Node node, List<Integer> data) {
        if (node != null) {
            traverseAndStore(node.left, data);
            data.add(node.data);
            traverseAndStore(node.right, data);
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }


    // Utility function to swap left subtree with right subtree
    public void swap(Node root) {
        if (root == null) {
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    // Function to convert a given binary tree into its mirror
    public void convertToMirror(Node root) {
        // base case: if the tree is empty
        if (root == null) {
            return;
        }

        // convert left subtree 1
        convertToMirror(root.left);

        // convert right subtree 2
        convertToMirror(root.right);

        // swap left subtree with right subtree
        swap(root);
    }


}
