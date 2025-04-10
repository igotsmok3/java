package com.itheima.mymap.JUC;

import java.lang.Runnable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class myRunnablesafe implements Runnable {

    int i = 100;// 定义100张票

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {

            lock.lock();
            try {
                if (method() != true) {
                    break;
                }
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
                // TODO: handle exception
            } finally {
                lock.unlock();
            }
        }
    }

    // 定义一个方法,将会在run()中被调用
    public boolean method() {
        if (i != 0) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            i--;
            return true;
        } else {
            return false;
        }
    }

    // 锁方法
    // public synchronized boolean method() {
    // if (i != 0) {
    // System.out.println(Thread.currentThread().getName() + ":" + i);
    // i--;
    // return true;
    // } else {
    // return false;
    // }
    // }

}
