package com.itheima.mymap.JUC;

import java.lang.Runnable;

public class myrun implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + "1111");
    }

}
