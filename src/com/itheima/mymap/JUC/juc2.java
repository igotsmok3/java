package com.itheima.mymap.JUC;

import java.lang.Runnable;

public class juc2 {
    public static void main(String[] args) {

        // 新建一个任务
        myrun r1 = new myrun();

        // 新建一个线程
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        // t1.setName("1:");
        // t2.setName("2:");

        System.out.println();

        t1.start();
        t2.start();

        // priority

    }

}
