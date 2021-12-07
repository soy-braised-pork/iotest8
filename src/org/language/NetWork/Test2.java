package org.language.NetWork;

import java.net.InetSocketAddress;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class Test2 {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("192.168.1.113", 8080);
        System.out.println(inetSocketAddress);
        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getHostName());
    }
}
