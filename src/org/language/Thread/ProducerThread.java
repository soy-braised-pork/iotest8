package org.language.Thread;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
//生产者
public class ProducerThread extends Thread {
    private Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            synchronized (p) {
                if (i % 2 == 0) {
                    p.setBrand("费列罗");
                    p.setName("巧克力");
                } else {
                    p.setBrand("哈尔滨");
                    p.setName("啤酒");
                }
            }
        }
        System.out.println("生产者生产了：" + p.getBrand() + p.getName());
    }
}
