package org.language.NetWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class Test1 {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress inetAddress = new InetAddress();  不能直接创建对象，呗default修饰
        InetAddress inetAddress = InetAddress.getByName("192.168.1.113");
        System.out.println(inetAddress);
        InetAddress inetAddress1 = InetAddress.getByName("localhost");
        System.out.println(inetAddress1);
        InetAddress inetAddress2 = InetAddress.getByName("DESKTOP-PM11IVP");
        System.out.println(inetAddress2);
        InetAddress inetAddress3 = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress3);  //DNS解析之后的IP
        inetAddress3.getAddress();
        inetAddress3.getHostAddress();
    }
}
