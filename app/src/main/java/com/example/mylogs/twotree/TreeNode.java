package com.example.mylogs.twotree;

public class TreeNode {
    public int key = 0;
    public boolean isVisited = false;
    public String data = null;
    public TreeNode LChild = null;
    public TreeNode RChild = null;

    public TreeNode(){}

    public TreeNode(int key, String data){
        this.key = key;
        this.data = data;
        this.LChild = null;
        this.RChild = null;
    }
}
