package org.language.MyTomcat;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-08
 */
public class MyResponse {

    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String str) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HTTP/1.1 200 OK\n")
                .append("Content-Type:text/html\n")
                .append("\r\n")
                .append("<html>")
                .append("<body>")
                .append("<h1>" + str + "</h1>")
                .append("<body>")
                .append("</html>");
        this.outputStream.write(stringBuilder.toString().getBytes());
        this.outputStream.flush();
        this.outputStream.close();
    }
}
