package org.language.Thread;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class MyTest2 extends Thread {
    static int ticknums = 10;

    @Override
    public void run() {
        //每个窗口后面有100个人在抢票
        for (int i = 1; i <= 100; i++) {
            synchronized (this) {
                if (ticknums > 0) {
                    System.out.println(Thread.currentThread().getName() + "我抢到第" + ticknums-- + "张票");
                }
            }
        }
    }

    public MyTest2(String name) {
        super(name);
    }
}
