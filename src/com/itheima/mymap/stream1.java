package com.itheima.mymap;

import java.util.ArrayList;
import java.util.Arrays;

public class stream1 {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("aaa");
        arr1.add("2");
        arr1.add("3");
        arr1.add("4");
        arr1.add("aab");

        // 终结方法forEach

        arr1.stream().filter(name -> name.startsWith("a")).filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));

        arr1.stream().forEach(s -> System.out.println(s));

        //单列集合使用colleciton中的默认方法（arr1.stream()）
        //双列集合使用entrySet或者其他方法变成单列集合，再使用stream流
        // 数组，直接调用Arrays中的静态方法 ： Arrays.stream(list1).
        // 一堆零散数据（不是数组），调用Stream接口中的静态方法 ： Stream.of(.....零散数据);

    }
}
