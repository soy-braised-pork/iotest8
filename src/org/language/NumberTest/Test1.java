package org.language.NumberTest;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-17
 */
public class Test1 {
    public static void main(String[] args) {
        //自动装箱   int--->integer
        Integer i1=10;
        //自动拆箱   integer--->int
        Integer i2 = new Integer(12);
        int i3=12;
        System.out.println(i2==i3);
        System.out.println(i2.equals(i3));


        Integer i4=12;
        System.out.println(i4==i3);
        System.out.println(i4==i2);
        System.out.println(i4.equals(i2));

        Integer i5=130;
        Integer i6=130;
        System.out.println(i5==i6);
        System.out.println(i5.equals(i6));

    }
}

/**
 * valueOf方法底层
 * 如果自动装箱值在-128~127之间，那么比较的就是具体的值；
 * 如果不在，比较的就是对象地址
 */
