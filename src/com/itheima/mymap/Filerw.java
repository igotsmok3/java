package com.itheima.mymap;

import java.io.FileReader;
import java.io.FileWriter;

public class Filerw {
    public static void main(String[] args) {

        // 字符输出流FileWriter
        try {
            FileWriter fw = new FileWriter("e.txt", true);// 续写

            fw.write("mamaba out", 0, 4);// 如果输入的是int，那么会根据当前字符集的编码方式来先编码，把编码后的数据写道文件中
            char[] chars = { 'a', 'b', 'c', 'd' };
            fw.write(chars);

            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        // 字符输入流

        // public int read();返回值是对应的ascii值，读到结尾的时候，返回-1
        // public int read(char[] buffer);返回值是每一次读取到的char类型的字符数，而不是ascii值,
        // 并且他会把读取到的值传到buffer字符数组里面,简而言之，带参数的read方法把去取数据，解码，强转三步合并了
        try {
            FileReader fr = new FileReader("e.txt");
            int len;
            char[] chars = new char[2];
            while ((len = fr.read(chars)) != -1) {

                // 所以这时候不能直接打印char（）了，必须先把char【】中的项转化为字符串打印出来
                String str = new String(chars, 0, len);
                System.out.println(str);// /r/n
            }

            fr.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
