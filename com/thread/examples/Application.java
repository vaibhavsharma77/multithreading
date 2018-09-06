package com.thread.examples;

public class Application {
    public static void main(String[] args) {

        Product product = new Product("Thread-First");
        product.start();
       //second thread
        Product product1 = new Product("Thread-Second");
        product1.start();
    }
}
