package com.itheima.mymap;

import java.util.LinkedHashMap;

public class mymap7 {
    public static void main(String[] args) {
        // LinkedHashMap

        // 创建集合
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        // 添加元素
        map.put("A", 1);
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println(map);
    }
}
