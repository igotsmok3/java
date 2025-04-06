package com.itheima.mymap.hashmap;

import java.util.HashMap;

public class TestHashMapWithoutOverride {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);  // 与 p1 在逻辑上相等
        
        map.put(p1, "Engineer");
        
        // 尝试用逻辑相等的 p2 获取值，但由于没有重写 hashCode/equals，将返回 null。如果重写了，则返回Engineer
        System.out.println("Value for p2: " + map.get(p2)); // 
}