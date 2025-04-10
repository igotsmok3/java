package com.itheima.mymap.JUC.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class producer extends Thread {

    ArrayBlockingQueue<String> q1;// 定义阻塞队列

    public producer(ArrayBlockingQueue<String> q1) {
        this.q1 = q1;
    }

    public void run() {
        while (true) {
            try {
                q1.put("mian");
                System.out.println("make 1 mian");
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
                // TODO: handle exception
            }
        }
    }
}
