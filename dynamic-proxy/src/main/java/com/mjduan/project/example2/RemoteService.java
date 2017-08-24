package com.mjduan.project.example2;

/**
 * Hans 2017-08-24 21:11
 */
public class RemoteService implements IService {
    @Override
    public String getService(String name, int number) {
        System.out.println(getClass().getName() + " receive name=" + name + " number=" + number);
        return name + ":" + number;
    }
}
