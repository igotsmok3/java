package com.itheima.mymap.TreeMap;

public class Student implements Comparable<Student> {
    String name;
    Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Student o) {
        // 返回值
        // 负数：当前元素小，存左边
        // 正数：当前元素大，右边
        // 0：舍弃
        int i = this.getAge() - o.getAge();
        i = (i == 0 ? this.getName().compareTo(o.getName()) : i);
        return i;
    }

    public String toString() {
        return this.getAge() + ":" + this.getAge();
    }
}
