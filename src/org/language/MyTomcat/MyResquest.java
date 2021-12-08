package org.language.MyTomcat;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-08
 */
public class MyResquest {
    private String requestMethod;
    private String requestUrl;

    public MyResquest(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len=0;
        String str=null;
        if ((len=inputStream.read(buffer))>0){
            str=new String(buffer,0,len);
        }
        String data=str.split("\n")[0];
        String[] params=data.split("");
        this.requestMethod=params[0];
        this.requestUrl=params[1];
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }
}
