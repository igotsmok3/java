package com.itheima.mymap.JUC;

import com.itheima.mymap.JUC.controller;

public class consumer extends Thread {

    // 定义消费者，首先，查看桌子上还有没有东西，有，就消耗一个，count--，并且唤醒生产者继续做，如果没有，就等待（wait（））

    // 1.循环
    // 2.同步代码块
    // 3.判断共享数据是否到了末尾
    // 4.没到末尾有什么情况（执行逻辑）
    public void run() {
        while (true) {
            synchronized (controller.control) {// 进入锁
                if (controller.ndcount == 0) {
                    try {
                        controller.control.wait();// 锁wait一下
                    } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                } else {
                    controller.ndcount--;
                    controller.control.notifyAll();
                    System.out.println("still alive " + ": " + controller.ndcount);
                }
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                    // TODO: handle exception
                }
            }
        }
    }
}
