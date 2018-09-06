package com.thread.examples;

public class Product extends Thread {
    String name;
    public Product(String name){
        this.name=name;
    }

    @Override
    public void run() {
      Thread.currentThread().setName(this.name);
       for(int i=1;i<=5;i++){
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("Thread Number"+i+":"+Thread.currentThread().getName());
       }
    }
}
