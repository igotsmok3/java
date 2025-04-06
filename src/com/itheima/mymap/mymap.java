package com.itheima.mymap;

import java.util.HashMap;
import java.util.Map;

public class mymap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // put:1.添加，2.覆盖
        // 当发生覆盖的时候，会把被覆盖的值进行返回（返回的值String）
        // 当发生添加的时候，会返回null

        map.put("man", "湖南");
        map.put("man2", "湖南");
        map.put("man3", "湖南");
        map.put("man4", "湖南");

        String value = map.put("man5", "shaud");
        System.out.println(value);// 返回了被覆盖的值

        // System.out.println(map);

        // 当使用remove时，会根据键来删整个键值对，并返回值
        String value2 = map.remove("man");
        System.out.println(value2);

        // 当使用clear时，会清空map集合
        // map.clear();
        // System.out.println(map);

        // 当使用isEmpty时，会判断map集合是否为空
        boolean value3 = map.isEmpty();
        System.err.println(value3);

        // 当使用size时，会返回map集合中键值对的数量
        int value4 = map.size();
        System.out.println(value4);

        // 判断集合是否含有指定的键
        boolean value5 = map.containsKey("man");
        System.out.println(value5);

        // 判断集合是否含有指定的值
        boolean value6 = map.containsValue("湖南");
        System.out.println(value6);

    }
}
