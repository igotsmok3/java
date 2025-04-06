package com.itheima.mymap;

import java.util.Arrays;
import java.util.ArrayList;

public class stream2 {
    public static void main(String[] args) {
        // 数组和stream

        // 数组为基本数据类型
        int[] list1 = { 1, 2, 3, 4, 5, 6 };

        Arrays.stream(list1).forEach(s -> System.out.println(s));

        // 数组为引用数据类型
        String[] list2 = { "1", "2", "3" };

        Arrays.stream(list2).forEach(s -> System.out.println(s));

    }
}
