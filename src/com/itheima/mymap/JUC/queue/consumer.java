package com.itheima.mymap.JUC.queue;

import java.util.concurrent.ArrayBlockingQueue;

public class consumer extends Thread {

    ArrayBlockingQueue<String> q1;

    public consumer(ArrayBlockingQueue<String> s1) {
        this.q1 = s1;

    }

    public void run() {
        while (true) {
            try {
                String m = q1.take();
                System.out.println(m);
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
