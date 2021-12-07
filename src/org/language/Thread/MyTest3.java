package org.language.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class MyTest3 implements Runnable {

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "--->" + i);

            lock.unlock();
        }
    }
}
