package com.itheima.mymap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.BiConsumer;

public class questions {
    public static void main(String[] args) {
        // 需求：定义一个map集合，键是省，值是城市，

        // 这个值是一个list，使用arraylist创建

        // 先定义一个map，存储string和arrlist
        HashMap<String, ArrayList<String>> mp1 = new HashMap<>();

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("1");
        arr1.add("2");
        arr1.add("3");
        arr1.add("4");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2 = new ArrayList<>();
        arr2.add("5");
        arr2.add("6");
        arr2.add("7");
        ArrayList<String> arr3 = new ArrayList<>();
        arr3 = new ArrayList<>();
        arr3.add("9");
        arr3.add("8");
        arr3.add("10");

        mp1.put("1", arr1);
        mp1.put("2", arr2);
        mp1.put("3", arr3);

        // 获取其中的键值对，找到其中的键和值并添加到字符串中
        Set<Map.Entry<String, ArrayList<String>>> entries = mp1.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",", "", "");// 使用逗号来分隔开1，2，3，4，否则就会出现1234连起来的情况
            for (String city : value) {
                sj.add(city);
            }
            System.out.println(key + "=" + sj);
        }

        // System.out.println(mp1);
    }

}
