package com.itheima.mymap.javaweb;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udpcatch {
    public static void main(String[] args) {
        try {
            DatagramSocket socket1 = new DatagramSocket(10000);
            byte[] bt1 = new byte[1024];
            DatagramPacket packet1 = new DatagramPacket(bt1, bt1.length);

            while (true) {
                socket1.receive(packet1);

                byte[] btrec = packet1.getData();

                System.out.println(new String(btrec));

            }

            // socket1.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
