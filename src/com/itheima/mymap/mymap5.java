package com.itheima.mymap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.Map;

import javax.swing.text.html.StyleSheet;

public class mymap5 {
    public static void main(String[] args) {
        // 随机数：Random.nextInt()
        // 总共有四个公园，80人投票
        String[] array = { "a", "b", "c", "d" };
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(array.length);
            list.add(array[index]);
        }

        HashMap<String, Integer> hm = new HashMap<>();
        for (String name : list) {
            if (hm.containsKey(name)) {
                int count = hm.get(name);
                count++;
                hm.put(name, count);
            } else {
                hm.put(name, 1);
            }
        }
        System.out.println(hm);

        // 求最大值：
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);

        // 找到最大值对应的景点
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }

    }
}
