package org.language.Thread;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class Test3 {
    public static void main(String[] args) {
        MyTest3 myTest3 = new MyTest3();
        Thread thread = new Thread(myTest3,"子线程");
        thread.start();
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }

    }

}
