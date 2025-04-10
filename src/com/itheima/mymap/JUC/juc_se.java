package com.itheima.mymap.JUC;

public class juc_se {
    public static void main(String[] args) {
        // 定义一个任务

        myrun_se r1 = new myrun_se();

        // 定义一个线程 && 将任务传到线程里面

        Thread t1 = new Thread(r1, "name1:");
        Thread t2 = new Thread(r1, "name2:");

        // setPriority设置线程优先级（1-10）

        t1.setPriority(1);
        t2.setPriority(10);

        // System.out.println(t1.getPriority());
        // System.out.println(t2.getPriority());

        // t1.start();
        // t2.start();

        // setDaemon设置为守护线程(当其他不是守护线程的线程结束了之后，守护线程就会结束。但是需要时间，表现为守护线程不会打印完)
        // 应用场景：比如聊天+传输文件的时候，聊天线程结束，那么传输文件线程应该也结束

        Thread t3 = new Thread(r1, "name3:");
        Thread t4 = new Thread(r1, "name4:");

        t4.setDaemon(true);

        t3.start();
        t4.start();

    }

}
