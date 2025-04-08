package com.itheima.mymap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import com.itheima.mymap.TreeMap.Student;

public class functioncontains {
    // 1.什么是方法引用?
    // 把已经存在的方法拿过来用，当做函数式接口中抽象方法的方法体
    // 是什么符号?2.::
    // 方法引用符
    // 3.方法引用时要注意什么?
    // 需要有函数式接口
    // 被引用方法必须已经存在
    // 被引用方法的形参和返回值需要跟抽象方法保持一致
    // 被引用方法的功能要满足当前的需求

    // 1.引用静态方法
    // 类名::静态方法
    // 2.引用成员方法
    // 对象::成员方法
    // this::成员方法
    // 成员方法super::
    // 3.引用构造方法
    // 类名::new
    // 4.使用类名引用成员方法
    // 类名::成员方法
    // 5.引用数组的构造方法数据类型[]::new

    // 练习3:创建集合添加学生对象，学生对象属性:name，age把姓名和年龄拼接成:张三-23的字符串，并放到数组当中(使用方法引用完成)
    public static void main(String[] args) {

        // 练习1:集合中存储一些字符串的数据，比如:张三,23收集到Student类型的数组当中(使用方法引用完成)
        ArrayList<String> arr1 = new ArrayList<>();
        Collections.addAll(arr1, "man,11", "man2,22", "woman,33");

        Student[] stus = arr1.stream().map(Student::new).toArray(Student[]::new);
        // toArray:将流中的元素转为数组,而collecitons针对的是集合，比如Set这种

        // 练习2:创建集合添加学生对象，学生对象属性:name，age只获取姓名并放到数组当中(使用方法引用完成)
        // 这种是对象：：方法
        String[] names = arr1.stream()
                .map(Student::new)// 这里：把string变成了student
                .map(Student::getName)// 这里：把student变成了string
                .toArray(String[]::new);// student.getname() == s->s.getname()

        // 关于collections：他是把数据获取到集合中
        // 关于toArray：他是把数据放到数组里面
        // List<Student> newlist =
        // list.stream().map(Student::new).collect(Collectors.toList());

        // 以后就用对象：：方法，不用类：：方法

        System.out.println(Arrays.toString(names));

    }

}
