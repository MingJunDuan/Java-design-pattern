package com.mjduan.project.example2.client;

import com.mjduan.project.example2.IService;
import com.mjduan.project.example2.client.proxy.RemoteServiceProxyFactory;
import com.mjduan.project.example2.client.proxy.ServiceInvocationHandler;
import com.mjduan.project.example2.server.ServerService;

/**
 * Hans 2017-08-24 21:45
 */
public class LocalClient {
    public static final String HOST = "127.0.0.1";

    public static void main(String[] args) {
        ServiceInvocationHandler serviceInvocationHandler = new ServiceInvocationHandler(IService.class, HOST, ServerService.PORT);
        IService service = (IService) RemoteServiceProxyFactory.getRemoteServiceProxy(serviceInvocationHandler);
        String result = service.getService("mjduan", 24);
        System.out.println("LocalHost:\nresult=" + result);
    }

}
