package org.language.iii;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-11-11
 */
public class test {

    int id;
    static int sid;

    public static void main(String[] args) {

        test.sid=100;
//        test.id=1;

        test t=new test();
        t.id=10;
        t.sid=20;

        test t1=new test();
        t1.id=10;
        t1.sid=20;

        test t2=new test();
        t.id=10;
        t.sid=30;

    }
}
