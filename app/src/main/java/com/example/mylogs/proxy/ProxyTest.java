package com.example.mylogs.proxy;

import android.content.Context;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public ProxyTest(){
    }

    public static void test(Context context){
        BuyAJ subject = new JJ01();

        JJ01InvocationHandler jj01InvocationHandler = new JJ01InvocationHandler(subject);

        BuyAJ jj01Proxy = (BuyAJ) Proxy.newProxyInstance(context.getClassLoader(),
                new Class[]{BuyAJ.class}, jj01InvocationHandler);

        jj01Proxy.buyAJ();
    }

}
