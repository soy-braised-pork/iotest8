package org.language.NumberTest;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-18
 */

import java.sql.Date;

/**
 * String->java.util.date 类型转换
 */

public class Test2 {
    public static void main(String[] args) {
        try{
            //String->java.sql.date
            java.sql.Date date = java.sql.Date.valueOf("2021-6-07"); // 2021/6/07
            //java.sql.date->java.util.date
            java.util.Date date1 = date;
            System.out.println(date1);
        }catch (IllegalArgumentException e){
            System.out.println("参数不合法");
        }
    }
}
