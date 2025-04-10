package com.itheima.mymap.JUC;

public class producer extends Thread {
    // 1.循环
    // 2.同步代码块
    // 3.判断共享数据是否到了末尾
    // 4.没到末尾有什么情况（执行逻辑）

    public void run() {
        while (true) {
            synchronized (controller.control) {
                if (controller.ndcount == 0) {
                    controller.ndcount++;
                    System.out.println("make 1  ");
                    controller.control.notifyAll();
                } else {
                    System.out.println("still have " + controller.ndcount);
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
