package com.itheima.mymap.javaweb;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class tcpsend {
    public static void main(String[] args) {
        try {
            // 设置默认编码为UTF-8
            System.setProperty("file.encoding", "UTF-8");
            // 创建与服务器的连接
            Socket socket1 = new Socket("127.0.0.1", 10001); // 连接到本地服务器
            OutputStream op = socket1.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(op, "UTF-8"));
            Scanner sc = new Scanner(System.in);

            // 持续发送数据
            while (true) {
                System.out.print("Enter message: ");
                String str = sc.nextLine(); // 获取用户输入的消息

                // 如果用户输入 "exit"，退出循环
                if (str.equalsIgnoreCase("exit")) {
                    break;
                }

                // 发送数据
                bw.write(str); // 写入数据
                bw.newLine(); // 添加换行符
                bw.flush(); // 确保数据被发送
            }

            // 关闭资源
            bw.close();
            op.close();
            socket1.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
