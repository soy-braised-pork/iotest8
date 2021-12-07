package org.language.Thread;

import java.util.concurrent.FutureTask;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class Test5 {
    public static void main(String[] args) throws Exception {
        MyTest5 myTest5 = new MyTest5();
        FutureTask futureTask = new FutureTask<>(myTest5);
        Thread thread = new Thread(futureTask);
        thread.start();
        //获取线程得到的返回值
        Object obj=futureTask.get();
        System.out.println(obj);
    }
}
