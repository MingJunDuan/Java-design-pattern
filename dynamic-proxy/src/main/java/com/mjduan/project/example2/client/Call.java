package com.mjduan.project.example2.client;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

/**
 * Hans 2017-08-24 21:13
 */
@Data
@ToString
public class Call implements Serializable {
    private static final long serialVersionUID=5386052199960133937L;
    private String className;
    private String methodName;
    private Class<?>[] paramType; //方法参数类型
    private Object[] params;//调用方法时传入的参数值

    private Object result;
    public Call(){}

    public Call(String className, String methodName, Class<?>[] paramType, Object[] params) {
        this.className = className;
        this.methodName = methodName;
        this.paramType = paramType;
        this.params = params;
    }
}
