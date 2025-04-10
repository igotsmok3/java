package com.itheima.mymap;

import java.io.FileInputStream;
import java.util.Arrays;
import java.io.UnsupportedEncodingException;

public class chinese {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 乱码

        // 编码方式分为三种。ASCII，GBK和UTF-8，
        // ASCII是1byte；
        // GBK英文1byte，中文2byte；
        // UTF8英文1byte，中文3byte；
        // 使用字节流会逐个byte读取，因此会乱码
        // 使用字符流则会根据解码的规则来读取；

        // encode

        String arr1 = "wang胤坤";
        byte[] bt1 = arr1.getBytes("GBK");
        System.out.println(Arrays.toString(bt1));

        // decode

        String str1 = new String(bt1, "GBK");
        System.out.println(str1);

        // try {
        // FileInputStream fis = new FileInputStream("a.txt");

        // fis.close();
        // } catch (Exception e) {
        // // TODO: handle exception
        // }

    }
}
