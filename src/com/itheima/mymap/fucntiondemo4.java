package com.itheima.mymap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

public class fucntiondemo4 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr, "1", "2", "3");

        // 抽象方法形参的详解:
        // 第一个参数:表示被引用方法的调用者，决定了可以引用哪些类中的方法（在这里面是String，因为apply需要传入String）
        // 在stream流当中，第一个参数一般都表示流里面的每一个数据。假设流里面的数据是字符串，那么使用这种方式进行方法引用，只能引用string这个类中的方法
        // 第二个参数到最后一个参数:跟被引用方法的形参保持一致，如果没有第二个参数，说明被引用的方法需要是无参的成员方法

        // 拿着流里面的每一个数据，去调用string类中的toUppercase方法，方法的返回值就是转换之后的结果。

        // public String toUpperCase() {
        // return toUpperCase(Locale.getDefault());
        // }

        arr.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));// 类名：方法名

        // arr.stream().map(new Function<String, String>() {
        // @Override
        // public String apply(String s) {
        // return s.toUpperCase();
        // }
        // }).forEach(s -> System.out.println(s));
    }
}
