package com.itheima.mymap.JUC;

import java.lang.Thread;
// import java.lang.reflect.Constructor;

public class myThread extends Thread {
    public myThread() {

    }

    public myThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 500) {
            System.out.println(this.getName());
            i++;
        }
    }

}
