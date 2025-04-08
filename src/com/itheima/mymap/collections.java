package com.itheima.mymap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class collections {
    public static void main(String[] args) {

        // collect方法的返回值由你的Collectors决定，Collectors.toList代表返回值是list。因此就需要List<String>之类的

        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "1-1-1", "2-2-2", "3-1-3");

        // 使用split取到某部分，然后使用Collections收集

        List<String> list1 = strings.stream()
                .filter(s -> s.split("-")[1].equals("1"))
                .collect(Collectors.toList());

        System.out.println(list1);
        System.out.println();

        // toList和toSet的区别是，如果你用hashSet收集起来的话，那就不会有重复的
        Set<String> set1 = strings.stream()
                .filter(s -> s.split("-")[1].equals("1"))
                .collect(Collectors.toSet());
        System.out.println(set1);

        // toMap(定义如何取键，定义如何取值)
        // Map<String, Integer> map1 = strings.stream()
        // .filter(s -> s.split("-")[1].equals("1"))
        // .collect(Collectors
        // .toMap(// 获取键的代码
        // new Function<String, String>() {
        // public String apply(String s) {
        // return s.split("-")[0];
        // }
        // }, // 获取值的代码
        // new Function<String, Integer>() {
        // public Integer apply(String s) {
        // return Integer.parseInt(s.split("-")[2]);
        // }
        // }));

        Map<String, Integer> map1 = strings.stream()
                .collect(Collectors.toMap(s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])));

        System.out.println(map1);
        // 注意：键不能有重复的，有重复的会报错
    }
}
