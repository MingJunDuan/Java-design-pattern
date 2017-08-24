package com.mjduan.project.example2.client.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Hans 2017-08-24 21:48
 */
public class RemoteServiceProxyFactory {

    public static Object getRemoteServiceProxy(InvocationHandler invocationHandler) {
        Class<?> classType = ((ServiceInvocationHandler) invocationHandler).getClassType();
        Object proxy = Proxy.newProxyInstance(classType.getClassLoader(), new Class[]{classType}, invocationHandler);
        return proxy;
    }

}
