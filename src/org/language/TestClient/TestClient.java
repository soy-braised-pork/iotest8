package org.language.TestClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class TestClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.199.217", 8888);
        OutputStream os=socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(os);
        dataOutputStream.writeUTF("你好");

        InputStream inputStream= socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String str=dataInputStream.readUTF();
        System.out.println("服务端"+str);

        dataInputStream.close();
        inputStream.close();
        dataOutputStream.close();
        os.close();
        socket.close();
    }
}
