package com.itheima.mymap.JUC;

import java.lang.Thread;

//public class Thread implements Runnable 
public class myThreadsafe extends Thread {// 我们自定义的线程

    // 同时卖一种票，定义静态int
    static int i = 0;

    // 目的：确保同一个对象内的多个线程（m1,m2,m3）在同一时刻只有一个线程执行 “ 被同步的方法 ”（这里是run（））
    // 其他线程在进入该方法前必须等待之前获取该锁的线程执行完毕并释放锁。

    // 定义静态的锁对象，这个对象是唯一的
    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            // synchronized (myThreadsafe.class) {// 使用一个唯一的对象来当作锁
            if (i < 50) {
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // System.out.println(i);
                System.out.println(this.getName() + "" + i);
                i++;
            } else {
                break;
            }
            // }
        }
    }

    // 使用同步方法来保证同时只有一个线程在使用某个方法
    // 原理：java中每个对象都有一个监视器monitor，一个线程调用一个同步方法时，它需要先获得对象的监视器锁。
    // JVM 在编译时会将同步方法转为“monitorenter”和“monitorexit”字节码指令。

}
