package com.itheima.mymap;

import com.itheima.mymap.Student;
import java.util.HashMap;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.Map;
import java.util.Map.Entry;;

public class mymap6 {
    public static void main(String[] args) {
        // HashMap<Student, String> students = new HashMap<>();

        // Student s1 = new Student("张三", 23);
        // Student s2 = new Student("李四", 24);
        // Student s3 = new Student("王五", 25);
        // Student s4 = new Student("赵六", 26);
        // Student s5 = new Student("孙七", 27);
        // Student s6 = new Student("张三", 23);

        // students.put(s1, "北京");
        // students.put(s2, "上海");
        // students.put(s3, "广州");
        // students.put(s4, "深圳");
        // students.put(s5, "成都");
        // students.put(s6, "重庆");

        // 遍历整个集合
        // Set<Student> names = students.keySet();
        // for (Student name : names) {
        // String value = students.get(name);
        // System.out.println(name.getName() + "=" + value);
        // }

        // 遍历整个集合2,通过entry的方式，获取键值对对象

        Map<Student, String> students = new HashMap<>();

        Student s1 = new Student("man", 1);
        Student s2 = new Student("man2", 2);
        Student s3 = new Student("man3", 3);
        Student s4 = new Student("man4", 4);
        Student s5 = new Student("man5", 5);
        Student s6 = new Student("man5", 5);

        students.put(s1, "11");
        students.put(s2, "22");
        students.put(s3, "33");
        students.put(s4, "44");
        students.put(s5, "55");
        students.put(s6, "66");

        // 遍历，1.通过获取全部键，把键保存在列表Set中
        // Set<Student> keys = students.keySet();
        // for (Student key : keys) {// 获取student对象：key
        // int age = key.getAge();
        // String name = key.getName();
        // System.out.println(name + ":" + age);
        // }

        // 遍历，2.通过获取键值对的方式，获取全部的键值对，并对每一个键值对获取他的键和他的值
        Set<Map.Entry<Student, String>> entries = students.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student s = entry.getKey();
            String v = entry.getValue();
            System.out.println(s + ":" + v);
        }

        // // 遍历，3.lambda
        // students.forEach(new BiConsumer<Student, String>() {
        // @Override
        // public void accept(Student key, String value) {
        // System.out.println(key + ":" + value);
        // }
        // });

        // HashMap的键的位置如果存储的是自定义对象，需要重写equals和hashCode
    }
}
