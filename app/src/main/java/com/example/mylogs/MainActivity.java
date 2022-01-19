package com.example.mylogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mylogs.twotree.BTree;
import com.example.mylogs.twotree.TreeNode;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BTree bTree = new BTree();
        TreeNode root = bTree.getRoot();
        createBTree(root);

        preOrder(root);
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
        root.LChild = nodeB;
        root.RChild = nodeC;
        nodeB.LChild = nodeD;
        nodeB.RChild = nodeE;
        nodeC.LChild = nodeF;
    }



}