package org.language.TestServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket s=serverSocket.accept();

        InputStream is=s.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(is);

        String str=dataInputStream.readUTF();
        System.out.println("客户端"+str);

        OutputStream outputStream=s.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("你好，我是服务器端，我接收到你的请求了");

        dataOutputStream.close();
        outputStream.close();
        dataInputStream.close();
        is.close();
        s.close();
        serverSocket.close();
    }
}
