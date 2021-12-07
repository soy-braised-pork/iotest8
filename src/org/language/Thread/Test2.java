package org.language.Thread;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class Test2 {
    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2("窗口1");
        MyTest2 myTest3 = new MyTest2("窗口2");
        MyTest2 myTest4 = new MyTest2("窗口3");

        myTest2.start();
        myTest3.start();
        myTest4.start();

    }
}
