package com.example.mylogs.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JJ01InvocationHandler implements InvocationHandler {
    private BuyAJ subject;

    public JJ01InvocationHandler(BuyAJ subject){
        this.subject = subject;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if(method.getName().equals("buyAJ")){
            System.out.println("代购去美国买AJ");
            return method.invoke(subject, objects);
        }

        return null;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                subject.getClass().getInterfaces(), this);
    }
}
