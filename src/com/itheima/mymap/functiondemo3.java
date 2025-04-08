package com.itheima.mymap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;

import com.itheima.mymap.TreeMap.Student;

public class functiondemo3 {
    // 引用构造方法，创建对象 类名：：new

    // 练习:
    // 集合里面存储姓名和年龄，比如:张无忌,15要求:将数据封装成Student对象并收集到List集合中

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "man,11", "man2,22", "woman,33");

        // 把这些字符串转为Student对象，调用stream的map方法,重写apply方法
        // List<Student> newlist = list.stream().map(new Function<String, Student>()
        // {//函数式接口
        // @Override
        // public Student apply(String s) {
        // String[] arr = s.split(",");
        // String name = arr[0];
        // Integer age = Integer.parseInt(arr[1]);
        // return new Student(name, age);
        // }
        // }).collect(Collectors.toList());

        // System.out.println(newlist);

        // 在这里，形参是String，返回值是Student，也就是说，我的Student class中必须要有一个构造函数，输入的形参只有一个String。
        List<Student> newlist = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newlist);

    }

}
