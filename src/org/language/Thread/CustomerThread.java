package org.language.Thread;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class CustomerThread extends Thread {
    private Product p;

    public CustomerThread(Product p){
        this.p=p;
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            synchronized (p) {
                System.out.println("消费者消费了：" + p.getBrand() + p.getName());
            }
        }
    }
}
