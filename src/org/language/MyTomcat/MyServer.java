package org.language.MyTomcat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-09
 */
public class MyServer {

    public static void startServer(int port) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        //定义服务端套接字
        ServerSocket serverSocket = new ServerSocket(port);
        //定义客户端套接字
        Socket socket = null;

        while (true) {
            socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            MyResquest myResquest = new MyResquest(inputStream);
            MyResponse myResponse = new MyResponse(outputStream);

            String clazz = new MyMapping().getMapping().get(myResquest.getRequestUrl());
            if (clazz != null) {
                Class<MyServlet> myServletClass = (Class<MyServlet>) Class.forName(clazz);
                MyServlet myServlet = myServletClass.newInstance();
                myServlet.service(myResquest, myResponse);
            }
        }
    }

    public static void main(String[] args) {
        try {
            startServer(10086);
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
