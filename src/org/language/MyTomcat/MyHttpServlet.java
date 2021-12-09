package org.language.MyTomcat;

import java.io.IOException;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-09
 */
public abstract class MyHttpServlet {

    public static final String METHOD_GET="GET";
    public static final String METHOD_POST="POST";


    public abstract void doGet(MyResquest resquest,MyResponse response) throws IOException;
    public abstract void doPost(MyResquest resquest,MyResponse response) throws IOException ;

    /**
     * 根据请求方式来判断调用哪种处理方法
     * @param resquest
     * @param response
     */
    public void service(MyResquest resquest,MyResponse response) throws IOException {
        if (METHOD_GET.equals(resquest.getRequestMethod())){
            doGet(resquest,response);
        }else if (METHOD_POST.equals(resquest.getRequestMethod())){
            doPost(resquest,response);
        }
    }
}
