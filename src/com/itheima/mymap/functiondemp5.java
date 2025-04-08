package com.itheima.mymap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class functiondemp5 {
    public static void main(String[] args) {
        // 引用数组的构造方法

        // 方法引用(数组的构造方法)格式
        // 数据类型[]::new(比如，Integer[])
        // 目的:
        // 创建一个指定类型的数组
        // 需求:
        // 集合中存储一些整数，收集到数组当中

        ArrayList<Integer> arr1 = new ArrayList<>();
        Collections.addAll(arr1, 1, 2, 5, 4, 5);

        // Integer[] ints = arr1.stream().toArray(new IntFunction<Integer[]>() {
        // @Override
        // public Integer[] apply(int value) {
        // return new Integer[value];
        // }

        // });
        // System.out.println(Arrays.toString(ints));

        Integer[] ints = arr1.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(ints));

        // 方法引用

    }
}
