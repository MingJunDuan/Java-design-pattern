package com.mjduan.project.src;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Hans 2017-08-24 00:20
 */
public class MethodProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (Object.class.equals(method.getDeclaringClass())) {
            return method.invoke(this, args);
        } else {
            return run(method, args);
        }
    }

    private Object run(Method method, Object[] args) {
        System.out.println("run method");
        //doing something here
        return "method call success";
    }

}
