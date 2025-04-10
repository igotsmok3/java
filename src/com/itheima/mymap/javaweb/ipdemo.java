package com.itheima.mymap.javaweb;

import java.net.InetAddress;

public class ipdemo {
    public static void main(String[] args) {
        try {
            InetAddress inet1 = InetAddress.getByName("LAPTOP-P2BOFK01");
            System.out.println(inet1);

            String name = inet1.getHostName();
            System.out.println(name);

            String ip = inet1.getHostAddress();
            System.out.println(ip);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
