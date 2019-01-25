package com.designmode.structure.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 组合模式，适用于树
 */
public class TreeNode {

    private String id;
    private String text;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    /**
     * 添加子节点
     * @param node
     */
    public void add(TreeNode node) {
        children.add(node);
    }

    /**
     * 删除子节点
     * @param node
     */
    public void remove(TreeNode node) {
        children.remove(node);
    }

    /**
     * 获取子节点
     * @param node
     */
    public Enumeration<TreeNode> getChildren(TreeNode node) {
        return children.elements();
    }
}
