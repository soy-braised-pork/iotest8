package org.language.Thread;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class Test1 {
    public static void main(String[] args) {
        //获取当前线程
        Thread.currentThread().setName("main");
        for (int i=1;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+"------>1" +i);
        }

        MyTest myTest = new MyTest();
        myTest.start();

        MyTest myTest1 = new MyTest("子线程2");
        myTest1.start();

        for (int i=1;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+"------>2" +i);
        }


    }
}
