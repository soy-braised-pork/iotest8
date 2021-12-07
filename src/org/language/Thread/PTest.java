package org.language.Thread;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-06
 */
public class PTest {
    public static void main(String[] args) {
        Product product = new Product();
        ProducerThread producerThread = new ProducerThread(product);
        CustomerThread customerThread = new CustomerThread(product);

        producerThread.start();
        customerThread.start();
    }
}
