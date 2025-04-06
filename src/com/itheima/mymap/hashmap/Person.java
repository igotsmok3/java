package com.itheima.mymap.hashmap;

import java.util.HashMap;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 注意：没有重写 hashCode() 和 equals()

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }

    // // 重写 equals() 方法
    // @Override
    // public boolean equals(Object o) {
    // if (this == o) return true;
    // if (!(o instanceof Person)) return false;
    // Person person = (Person) o;
    // return age == person.age && Objects.equals(name, person.name);
    // }

    // // 重写 hashCode() 方法
    // @Override
    // public int hashCode() {
    // return Objects.hash(name, age);
    // }

}