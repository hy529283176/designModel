package com.designmode.demo;

import com.designmode.structure.composite.Tree;
import com.designmode.structure.composite.TreeNode;

public class CompositeTest {

    public static void main(String[] args) {
        Tree tree = new Tree("100", "根目录");
        TreeNode nodeA = new TreeNode("100A100","目录A");
        TreeNode nodeB = new TreeNode("100A100B100","目录B");
        nodeA.add(nodeB);
        tree.getRoot().add(nodeA);
        System.out.println("build the tree finished!");
    }
}
