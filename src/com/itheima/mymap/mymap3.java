package com.itheima.mymap;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class mymap3 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("张三", 23);
        maps.put("李四", 24);
        maps.put("王五", 25);
        maps.put("赵六", 26);
        maps.put("孙七", 27);

        // 直接获取键值对对象entry，通过getvalue和getkey来获取，entry还是被保存在Set对象中
        Set<Entry<String, Integer>> entries = maps.entrySet();// 返回一个键值对对象
        for (Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        for (Entry<String, Integer> entry : maps.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
