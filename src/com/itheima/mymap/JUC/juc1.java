package com.itheima.mymap.JUC;

public class juc1 {

    public static void main(String[] args) {

        Thread t1 = new myThread();// 线程1
        Thread t2 = new myThread();// 线程2

        t1.setName("1");
        t2.setName("2");

        t1.start();
        t2.start();
    }
}
