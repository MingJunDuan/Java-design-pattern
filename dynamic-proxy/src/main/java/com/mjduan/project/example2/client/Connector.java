package com.mjduan.project.example2.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Hans 2017-08-24 21:19
 */
@Data
@NoArgsConstructor
public class Connector {
    private Socket socket;
    private InputStream inputStream;
    private ObjectInputStream objIn;
    private OutputStream outputStream;
    private ObjectOutputStream objOut;

    public void connect(String host, Integer port) throws IOException {
        socket = new Socket(host, port);
        inputStream = socket.getInputStream();
        outputStream = socket.getOutputStream();

        objOut = new ObjectOutputStream(outputStream);
        objIn = new ObjectInputStream(inputStream);
    }

    public void sendRequest(Call call) throws IOException, ClassNotFoundException {
        objOut.writeObject(call);
    }

    public Call receive() throws IOException, ClassNotFoundException {
        return (Call) objIn.readObject();
    }


    public void close() {
        try {
            socket.close();
            objIn.close();
            objOut.close();
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
