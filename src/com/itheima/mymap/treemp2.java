package com.itheima.mymap;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class treemp2 {
    public static void main(String[] args) {
        String st1 = "aaaaabbbbcccdde";
        TreeMap<Character, Integer> tm1 = new TreeMap<>();
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < st1.length(); i++) {
            char c = st1.charAt(i);
            // System.out.println(c);
            if (tm1.containsKey(c)) {
                int count = tm1.get(c);
                count++;
                tm1.put(c, count);

            } else {
                tm1.put(c, 1);
            }
        }

        System.out.println(tm1);

        // 遍历整个tm1
        tm1.forEach(new BiConsumer<Character, Integer>() {
            @Override
            public void accept(Character key, Integer value) {
                sb1.append(key).append("(").append(value).append(")");
            }
        });

        System.out.println(sb1);
    }
}
