package com.mjduan.project.example2.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

import com.mjduan.project.example2.IService;
import com.mjduan.project.example2.RemoteService;
import com.mjduan.project.example2.client.Call;

/**
 * Hans 2017-08-24 21:25
 */
public class ServerService {
    public static final int PORT = 8010;
    private IService service;

    public ServerService() {
        service = new RemoteService();
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
        ServerService serverService = new ServerService();
        System.out.println("Service started");
        serverService.doServer();
    }

    public void doServer() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        while (true) {
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            Call call = (Call) objectInputStream.readObject();
            System.out.println("Receive request:" + call.toString());
            Call callResult = getCallResult(call);
            objectOutputStream.writeObject(callResult);

            objectOutputStream.close();
            objectInputStream.close();
            inputStream.close();
            outputStream.close();

            socket.close();
        }

    }

    private Call getCallResult(Call call) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String className = call.getClassName();
        String methodName = call.getMethodName();
        Object[] params = call.getParams();
        Class<?>[] paramType = call.getParamType();


        Class<?> aClass = Class.forName(className);
        Method method = aClass.getMethod(methodName, paramType);
        Object result = method.invoke(service, params);
        call.setResult(result);
        return call;
    }
}
