package com.mjduan.project.example2.client.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import lombok.AllArgsConstructor;
import lombok.Data;

import com.mjduan.project.example2.client.Call;
import com.mjduan.project.example2.client.Connector;

/**
 * Hans 2017-08-24 21:37
 */
@Data
@AllArgsConstructor
public class ServiceInvocationHandler implements InvocationHandler {
    private Class<?> classType;
    private String host;
    private Integer port;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Call call = new Call(classType.getName(), method.getName(), method.getParameterTypes(), args);
        Connector connector = new Connector();
        connector.connect(host,port);
        connector.sendRequest(call);
        connector.close();
        Object result = call.getResult();
        return result;
    }


}
