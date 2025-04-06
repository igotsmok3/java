package com.itheima.mymap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class stream4 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "1", "2", "3", "4", "5", "1");

        ArrayList<String> strings2 = new ArrayList<>();
        Collections.addAll(strings2, "1", "2", "3", "4", "5", "6");

        ArrayList<String> strings3 = new ArrayList<>();
        Collections.addAll(strings3, "1-1", "2-1", "3-1", "4-1", "5-1", "6-1");
        // 注意stream流只适用于List
        // skip跳过前n个元素
        // limit只选前n个元素
        // strings.stream().skip(1).limit(3).forEach(s -> System.out.println(s));

        // // distinct去重，底层是hashcode和equals方法，因此在自定义类的时候需要重写。就比如ArrayList<Student>
        // strings.stream().distinct().forEach(s -> System.out.println(s));

        // // concat合并两个流,尽可能让数据类型保持一致
        // Stream.concat(strings.stream(), strings2.stream()).forEach(s ->
        // System.out.println(s));

        // 类型转换map，转换流里面数据类型(new Function(*,*))
        // strings3.stream().map(new Function<String, Integer>() {
        // @Override
        // public Integer apply(String s) {
        // String[] arr = s.split("-");
        // String ageString = arr[1];
        // int age = Integer.parseInt(ageString);
        // return age;
        // }
        // }).forEach(s -> System.out.println(s));

        strings3.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));

    }
}
