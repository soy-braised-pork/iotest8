package org.language.MyTomcat;

import java.io.IOException;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-09
 */
public class MyServlet extends MyHttpServlet {


    @Override
    public void doGet(MyResquest resquest, MyResponse response) throws IOException {
        response.write("mytomcat");
    }

    @Override
    public void doPost(MyResquest resquest, MyResponse response) throws IOException {
        response.write("post tomcat");

    }
}
