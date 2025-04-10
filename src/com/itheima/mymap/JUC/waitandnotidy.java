package com.itheima.mymap.JUC;

public class waitandnotidy {

    public static void main(String[] args) {
        consumer cons = new consumer();
        producer prod = new producer();

        cons.setName("consumer:");
        prod.setName("producer");

        cons.start();
        prod.start();

    }
}
