package com.example.mylogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mylogs.twotree.BTree;
import com.example.mylogs.twotree.BTreeTest;
import com.example.mylogs.twotree.TreeNode;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new BTreeTest();
    }





}