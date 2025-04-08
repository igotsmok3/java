package com.itheima.mymap;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
// import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class io {
    public static void main(String[] args) throws Exception {

        // FileOutputStream stream1 = new FileOutputStream("../a.txt");//小心，会清空文件
        // stream1.write(66);//整数在ascii中对应的字符
        // stream1.close();//相当于java停止占用这个文件了

        // write：写一个字节、一个字节数组、一个字节数组中的一部分
        // FileOutputStream stream1 = new FileOutputStream("a.txt");
        // try {
        // stream1.write(5);
        // stream1.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // try {
        // String content = "helloworld";
        // byte[] data = content.getBytes();
        // FileOutputStream stream2 = new FileOutputStream("b.txt");
        // System.out.println(Arrays.toString(data));
        // stream2.write(data);// write了一个存储byte的数组（上一个是write了一个byte）
        // stream2.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // try {// write写入字节数组的一部分
        // FileOutputStream stream3 = new FileOutputStream("c.txt");
        // String content = "mygod";
        // byte[] bytes = content.getBytes();
        // stream3.write(bytes, 1, 4);
        // stream3.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // public void printStackTrace() {
        // printStackTrace(System.err);
        // }

        // FileoutputStream实现换行和续写，

        // try {
        // FileOutputStream fos = new FileOutputStream("a.txt");//
        // true:是否可以执行续写，默认是false，可以续写是true
        // String line1 = "hello";
        // String line2 = "world";

        // fos.write(line1.getBytes());
        // fos.write(System.lineSeparator().getBytes());// 执行换行
        // fos.write(line2.getBytes());

        // String line3 = " new";
        // fos.write(line3.getBytes());// 续写

        // fos.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // try {
        // FileOutputStream fos = new FileOutputStream("a.txt", true);// 续写
        // String line = "1111";
        // fos.write(line.getBytes());
        // fos.close();
        // } catch (Exception e) {
        // e.printStackTrace();

        // }

        // //
        // FileInputStream(先建立连接，然后定义一个缓冲区，读取文件（使用read（）），把读取出来的东西放在缓冲区里面，再将读取的字节转为char)
        // try {
        // FileInputStream fis = new FileInputStream("a.txt");
        // int data = fis.read();
        // System.out.println(data);
        // System.out.println((char) data);
        // System.out.println();
        // fis.close();

        // } catch (Exception e) {
        // e.printStackTrace();
        // // TODO: handle exception
        // }

        // 关于read中的指针：
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            int data = fis.read();
            int data2 = fis.read();
            System.out.println((char) data);
            System.out.println((char) data2);// 自动进入下一个
            System.out.println();
            fis.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // // 关于循环读取
        // try {
        // FileInputStream fis = new FileInputStream("a.txt");
        // int r = fis.read();
        // while (r != -1) {
        // System.out.println(r);
        // System.out.println((char) r);
        // System.out.println();
        // r = fis.read();
        // }
        // fis.close();
        // } catch (Exception e) {
        // // TODO: handle exception
        // e.printStackTrace();
        // }

        // 文件拷贝

        // 先读取（3步）FileInputStream
        // 再写入(3步) FIleoutputStream
        // try {
        // FileInputStream fis = new FileInputStream("a.txt");
        // FileOutputStream fos = new FileOutputStream("d.txt", true);

        // int r = fis.read();
        // while (r != -1) {
        // System.out.println((char) r);
        // System.out.println(r);

        // fos.write(r);
        // r = fis.read();
        // System.out.println();
        // }
        // fis.close();
        // fos.close();

        // } catch (Exception e) {
        // e.printStackTrace();
        // // TODO: handle exception
        // }

        // FileInputStream一次性读取多个字节（byte[]）
        try {
            FileInputStream fis = new FileInputStream("a.txt");
            byte[] buffer = new byte[2];// 定义一个缓冲区
            int byteread = fis.read(buffer);// 返回实际上读取到的字节数,把从文件中读取到的内容写到buffer中
            if (byteread != -1) {
                String string = new String(buffer);
                System.out.println(string);
            }

            // 注意，此时文件还没有关闭，所以指针位置在2的地方
            byte[] buffer2 = new byte[2];
            int byteread2 = fis.read(buffer2);
            if (byteread2 != -1) {
                String string = new String(buffer2);
                System.out.println(string);
            }
            fis.close();

            // 指针重置
            FileInputStream fis2 = new FileInputStream("a.txt");
            byte[] buffer3 = new byte[2];
            int byteread3 = fis2.read(buffer3);
            if (byteread3 != -1) {
                String string = new String(buffer3);
                System.out.println(string);
            }
            fis2.close();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

    }
}
