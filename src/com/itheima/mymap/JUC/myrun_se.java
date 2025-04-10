package com.itheima.mymap.JUC;

import java.lang.Runnable;
import java.lang.Thread;

public class myrun_se implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            Thread t1 = Thread.currentThread();// 获取当前的线程对象，而不是创建一个线程
            System.out.println(t1.getName() + i);
            i++;
        }
    }

}
