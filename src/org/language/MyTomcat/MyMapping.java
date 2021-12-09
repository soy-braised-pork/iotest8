package org.language.MyTomcat;

import java.util.HashMap;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-09
 */
public class MyMapping {
    public static HashMap<String,String> mapping=new HashMap<String, String>();

    static {
        mapping.put("/mytomcat","org/language/MyTomcat/MyServlet");
    }

    public HashMap<String,String> getMapping(){
        return mapping;
    }
}
