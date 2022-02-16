package com.example.mylogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.mylogs.callfutrue.CallableTest;
import com.example.mylogs.produceconsume.BlockQueueTest;
import com.example.mylogs.produceconsume.KaoYaLockTest;
import com.example.mylogs.produceconsume.KaoYaMultiThreadTest;
import com.example.mylogs.produceconsume.KaoYaTest;
import com.example.mylogs.sort.BubbleSort;
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


        BubbleSort.test();
//        new BlockQueueTest();
//        new KaoYaMultiThreadTest();
//        new KaoYaLockTest();
//        new BTreeTest();
//        new CallableTest();
//        new KaoYaTest();
    }





}