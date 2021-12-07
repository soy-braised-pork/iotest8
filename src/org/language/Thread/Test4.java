package org.language.Thread;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        MyTest4 myTest4 = new MyTest4();
        Thread thread1 = new Thread(myTest4, "窗口1");
        Thread thread2 = new Thread(myTest4, "窗口2");
        Thread thread3 = new Thread(myTest4, "窗口3");
        thread1.start();
//        thread1.join();
        thread2.start();
//        Thread.sleep(3000);
        thread3.start();
//        thread1.setPriority(10); //设置优先级别
    }
}
