package com.itheima.mymap.JUC;

public class jucsafe {
    public static void main(String[] args) {

        // myThreadsafe m1 = new myThreadsafe();
        // myThreadsafe m2 = new myThreadsafe();
        // myThreadsafe m3 = new myThreadsafe();

        // m1.setName("1:");
        // m2.setName("2:");
        // m3.setName("3:");

        // m2.start();

        // m1.start();

        // m3.start();
        // }

        // 定义四个线程,这些线程
        // 使用一个myRUnnable的对象(任务)

        myRunnablesafe m1 = new myRunnablesafe();// 将同一个对象传给多个线程,所以不需要考虑static.

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(m1);
        Thread t4 = new Thread(m1);
        // Thread t1= new Thread(m1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
