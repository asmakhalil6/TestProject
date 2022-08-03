package com.example.practise.google.tree;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new BinaryTree.Node(5);
        binaryTree.insert(binaryTree.root, 2);
        binaryTree.insert(binaryTree.root, 4);
        binaryTree.insert(binaryTree.root, 8);
        binaryTree.insert(binaryTree.root, 6);
        binaryTree.insert(binaryTree.root, 7);
        binaryTree.insert(binaryTree.root, 3);
        binaryTree.insert(binaryTree.root, 9);
        binaryTree.traverseInOrder(binaryTree.root);

        // binaryTree.convertToMirror(binaryTree.root);
        //binaryTree.traverseInOrder(binaryTree.root);
        System.out.println();
        System.out.println();

        BinaryTree binaryTree2 = new BinaryTree();
        binaryTree2.root = new BinaryTree.Node(5);
        binaryTree2.insert(binaryTree2.root, 67);
        binaryTree2.insert(binaryTree2.root, 4);
        binaryTree2.insert(binaryTree2.root, 8);
        binaryTree2.insert(binaryTree2.root, 6);
        binaryTree2.insert(binaryTree2.root, 7);
        binaryTree2.insert(binaryTree2.root, 3);
        binaryTree2.insert(binaryTree2.root, 9);
        binaryTree2.traverseInOrder(binaryTree2.root);
        System.out.println();
        System.out.println(binaryTree2.isSame(binaryTree2.root, binaryTree.root));

        System.out.println();
    }


}
