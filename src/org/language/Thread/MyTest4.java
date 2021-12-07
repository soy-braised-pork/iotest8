package org.language.Thread;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class MyTest4 implements Runnable {
    int ticknum = 10;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            //只有一个锁,括号里面才是锁
            synchronized (MyTest4.class) {
                if (ticknum > 0) {
                    System.out.println(Thread.currentThread().getName() + "我抢到第" + ticknum-- + "车票");
                }
            }
        }
    }
}
