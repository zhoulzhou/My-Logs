package com.example.mylogs.twotree;

import android.util.Log;

import java.util.Stack;

public class BTreeTest {

    private static final String TAG = "BTreeTest";

    public BTreeTest(){
        BTree bTree = new BTree();
        TreeNode root = bTree.getRoot();
        createBTree(root);

        noPreOrder(root);
    }

    private void noPreOrder(TreeNode node){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pNode = node;
        while (pNode != null || stack.size() > 0){
            while (pNode != null){
                visit(pNode);
                stack.push(pNode);
                pNode = pNode.LChild;
            }
            if(stack.size() > 0){
                pNode = stack.pop();
                pNode = pNode.RChild;
            }
        }
    }

    private void preOrder(TreeNode node){
        if(node != null){
            visit(node);
            preOrder(node.LChild);
            preOrder(node.RChild);
        }
    }

    private void inOrder(TreeNode node){
        if(node != null){
            inOrder(node.LChild);
            visit(node);
            inOrder(node.RChild);
        }
    }

    private void postOrder(TreeNode node){
        if(node != null){
            postOrder(node.LChild);
            postOrder(node.RChild);
            visit(node);
        }
    }

    private void visit(TreeNode node){
        node.isVisited = true;
        Log.d(TAG,"visit node === " + node.data);
    }

    private void createBTree(TreeNode root){
        TreeNode nodeB = new TreeNode(2, "B");
        TreeNode nodeC = new TreeNode(3, "C");
        TreeNode nodeD = new TreeNode(4, "D");
        TreeNode nodeE = new TreeNode(5, "E");
        TreeNode nodeF = new TreeNode(6, "F");
        TreeNode nodeG = new TreeNode(7, "G");
        root.LChild = nodeB;
        root.RChild = nodeC;
        nodeB.LChild = nodeD;
        nodeB.RChild = nodeE;
        nodeC.LChild = nodeF;
        nodeC.RChild = nodeG;
    }
}
