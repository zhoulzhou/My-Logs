package com.example.mylogs.twotree;

public class BTree {
    private TreeNode root = null;

    public BTree(){
        root = new TreeNode(1, "A");
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

}
