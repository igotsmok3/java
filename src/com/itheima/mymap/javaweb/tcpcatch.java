package com.itheima.mymap.javaweb;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpcatch {
    public static void main(String[] args) {
        try {
            // 设置默认编码为UTF-8
            System.setProperty("file.encoding", "UTF-8");
            // 创建服务器对象，监听端口10001
            ServerSocket server1 = new ServerSocket(10001);

            // 等待客户端连接
            Socket socket1 = server1.accept();

            // 获取输入流
            InputStream stream = socket1.getInputStream();

            // 使用 InputStreamReader 和 BufferedReader 来按行读取数据
            InputStreamReader reader = new InputStreamReader(stream, "UTF-8");
            BufferedReader bf = new BufferedReader(reader);
            String line;

            // 持续读取数据
            while ((line = bf.readLine()) != null) {
                System.out.println("Received: " + line); // 打印接收到的消息
            }

            // 关闭资源
            bf.close();
            reader.close();
            socket1.close();
            server1.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
