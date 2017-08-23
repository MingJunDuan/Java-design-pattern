package com.mjduan.project.test;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.mjduan.project.src.IUserDao;
import com.mjduan.project.src.MethodProxy;

/**
 * Hans 2017-08-24 00:25
 */
public class ProxyTest {

    @Test
    public void test2() {
        MethodProxy methodProxy = new MethodProxy();
        IUserDao userDao = (IUserDao) Proxy.newProxyInstance(IUserDao.class.getClassLoader(), new Class[]{IUserDao.class}, methodProxy);

        String userName = userDao.getUserName();
        System.out.println(userName);
    }

}
