package com.learn.spring.proxy;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @author : Kristen
 * @date : 2022/1/13
 * @description :
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;

    public DynamicProxy(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前逻辑");
        Object result = method.invoke(object, args);
        System.out.println("执行后逻辑");
        return result;
    }
}
