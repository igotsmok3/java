package com.itheima.mymap.javaweb;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class udpsend {
    public static void main(String[] args) {

        try {
            DatagramSocket socket1 = new DatagramSocket();// 创建一个socket,传入的参数是端口号，指的是你使用哪个端口进行传输
            Scanner sc = new Scanner(System.in);
            System.out.println("enter message");
            while (true) {
                String str1 = sc.nextLine();
                byte[] bt1 = str1.getBytes();// 把字符串变成字节数组
                InetAddress address1 = InetAddress.getByName("127.0.0.1");
                int port1 = 10000;
                DatagramPacket packet1 = new DatagramPacket(bt1, bt1.length, address1, port1);// 打包数据
                socket1.send(packet1);
            }
            // socket1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
