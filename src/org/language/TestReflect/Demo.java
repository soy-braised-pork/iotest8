package org.language.TestReflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-07
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String str = "org.language.TestReflect.WeChat";

        Class c = Class.forName(str);
        Object o = c.newInstance();
        Method m= c.getMethod("payOnline");
        m.invoke(o);
    }
}
