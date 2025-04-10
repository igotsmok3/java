package com.itheima.mymap.JUC.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class controller {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> q1 = new ArrayBlockingQueue<>(10);
        producer p = new producer(q1);
        consumer c = new consumer(q1);

        p.start();
        c.start();
    }

}
