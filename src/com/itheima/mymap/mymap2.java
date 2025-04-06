package com.itheima.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

// 通过键来查找值 

public class mymap2 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("张三", 23);
        maps.put("李四", 24);
        maps.put("王五", 25);
        maps.put("赵六", 26);
        maps.put("孙七", 27);
        maps.put("周八", 28);
        maps.put("吴九", 29);

        // 获取map中所有的键，保存在Set集合中

        // // Set本身是一个接口，它不能实例化，但是可以声明一个接口类型的变量，在这里，keys就是接口类型的变量
        // Set<String> keys = maps.keySet();
        // for (String key : keys){
        // //获取所有的键之后，通过遍历的方式来找每个键对应的值(maps.get(key)：获取maps中key对应的值)
        // Integer value = maps.get(key);
        // System.out.println(key + "=" + value);
        // }

        // // 迭代器，也是先获取map中所有的键，保存在Set集合中,然后通过迭代器的方法遍历他们
        // Set<String> keys2 = maps.keySet();
        // Iterator<String> it = keys2.iterator();// Iterator是一个接口，
        // while (it.hasNext()) {
        // String key = it.next();
        // Integer value = maps.get(key);
        // System.out.println(key + "=" + value);
        // }

        // 也是先获得map中所有的键，保存在Set集合中，然后用lambda表达式遍历他们
        Set<String> keys3 = maps.keySet();
        keys3.forEach(key -> {
            Integer value = maps.get(key);// 获取map中key对应的值
            System.out.println(key + "=" + value);
        });

    }
}
