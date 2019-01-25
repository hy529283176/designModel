package com.designmode.structure.composite;

public class Tree {

    private TreeNode root;

    public Tree(String id, String text) {
        root = new TreeNode(id, text);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
