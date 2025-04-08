package com.itheima.mymap;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class fucntiondemo2 {
    // 静态方法： 类名：：静态方法
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "111", "112", "113", "224", "115");

        // for (String string : strings) {
        // ints.add(fucntiondemo2.str2int(string));
        // }

        // // 方法引用

        // ints.stream()
        // .map(new Function<String, Integer>() {
        // @Override
        // public Integer apply(String s) {
        // return Integer.parseInt(s);
        // }

        // }).forEach(s -> System.out.println(s));

        // System.out.println(ints);

        // public static int parseInt(String s)和map中apply的返回值，形参都是一样的类型
        // strings.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));

        /*
         * 引用成员方法： 对象：：成员方法
         * 其他类对象：：方法
         * this::方法
         * super：：方法
         * 
         */

        // strings.stream().filter(new Predicate<String>() {//函数式接口
        // @Override
        // public boolean test(String s) {
        // return s.startsWith("1") && s.length() == 3;
        // }
        // })
        // .forEach(s -> System.out.println(s));

        // 方法引用,使用StringOperation对象中的方法
        // 其他类
        StringOperation s1 = new StringOperation();
        strings.stream().filter(s1::stringJudge).forEach(s -> System.out.println(s));

        // 本类.但是由于public static void main式静态方法，所以this会报错

        strings.stream().filter(new fucntiondemo2()::stringJudge).forEach(s -> System.out.println(s));

        // 父类

    }

    public static int str2int(String a) {
        return Integer.parseInt(a);
    }

    public boolean stringJudge(String s) {
        return s.startsWith("1") && s.length() == 3;
    }
}
