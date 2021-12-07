package org.language.NumberTest;

import java.util.Date;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-18
 */
public class DataTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getMonth()+1);
        System.out.println(System.currentTimeMillis());
        System.out.println(date.getTime());
        //util->sql
        java.sql.Date date1 = new java.sql.Date(123456789L);
        Date date2=new java.sql.Date(date.getTime());
        System.out.println(date1);
        //sql->util
        Date date3 = (Date) date1;
        System.out.println(date3.getTime());
    }
}
