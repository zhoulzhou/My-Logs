package com.example.mylogs.twotree;

public class TreeNode {
    private int key = 0;
    private boolean isVisited = false;
    private String data = null;
    private TreeNode LChild = null;
    private TreeNode RChild = null;

    public TreeNode(){}

    public TreeNode(int key, String data){
        this.key = key;
        this.data = data;
        this.LChild = null;
        this.RChild = null;
    }
}
