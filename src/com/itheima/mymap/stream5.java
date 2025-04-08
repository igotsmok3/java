package com.itheima.mymap;

import java.lang.Object;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class stream5 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "1", "2", "3", "4", "5", "1");
        // count() 统计，返回值类型为long
        long count = strings.stream().count();
        System.out.println(count);

        // toArray:收集stream流中的数据，放到数组中
        // Object[] arr1 = strings.stream().toArray();
        // System.out.println();
        // System.err.println(arr1);
        // System.out.println(Arrays.toString(arr1));

        // // toArray方法参数的作用是创建一个指定类型的数组（比如，创建一个String[]）
        // // toArray方法的返回值是一个装着流中所有数据的数组

        // String[] arr2 = strings.stream().toArray(new IntFunction<String[]>() {
        // @Override
        // public String[] apply(int value) {
        // return new String[value];
        // }
        // });

        // System.out.println(Arrays.toString(arr2));

        String[] arr = strings.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr));

    }
}
